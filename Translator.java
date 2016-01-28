import java.util.regex.Pattern;

public class Translator extends simpleBaseListener {
    
    
    Scope activeScope;
    String result;
    boolean enteredAssign;
    boolean assignToHash;
    boolean insideFunction;
    
    public Translator() {
        result="import java.util.*;\n\n";
        enteredAssign = false;
        assignToHash = false;
        insideFunction = false;
    }
    
    public void setScope(Scope scope) {
        activeScope = scope;
    } 
    
    public String getResult() {
        return result;
    }
    
    private String toJavaType(String type) {
        String result = "";
        
        switch(type) {
            case "number":
                result = "int";
                break;
            case "real":
                result = "float";
                break;
            case "string":
                result = "String";
                break;    
        }
        
        return result;
    }
    
    @Override
    public void exitInput(simpleParser.InputContext ctx) {
        String varName = ctx.variable().getText();
        if (varName.contains("[")) {
            varName = varName.split("[")[0];
        } else if (varName.contains(".")) {
            varName = varName.split(".")[0];
        }
        
        String varType = activeScope.getTypeOf(varName);
        
        switch (varType) {
            case "number":
                result += " = reader.nextInt()";
                break;
            case "string":
                result += " = reader.nextLine()";
                break;
            case "real":
                result += " = reader.nextFloat()";
                break;
        }
        
        result += ";\n";
    }
    
    @Override
    public void enterDictDefinition(simpleParser.DictDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        
        result += "HashMap "+id+" = "+"new HashMap():\n";
    }
        
    @Override
    public void enterProgram(simpleParser.ProgramContext ctx) {
        if (activeScope.getParent() == null) {
            result += "public class Program {\n Scanner reader = new Scanner(System.in);\n";
        }
    }
    
    @Override
    public void enterSubblock(simpleParser.SubblockContext ctx) {
        result += "{\n";
    }
    
    @Override
    public void exitSubblock(simpleParser.SubblockContext ctx) {
        result += "}\n";
    }
    
    @Override
    public void enterElseBranch(simpleParser.ElseBranchContext ctx) {
        result += "else";
    }
    
    @Override
    public void exitProgram(simpleParser.ProgramContext ctx) {
        if (activeScope.getParent() == null) {
            result += "}";
        }
    } 
    
    @Override
    public void enterOutput(simpleParser.OutputContext ctx) {
        result += "System.out.println(";
    }
    
    @Override
    public void exitOutput(simpleParser.OutputContext ctx) {
        result += ");\n";
    }
    
    @Override
    public void enterVariable(simpleParser.VariableContext ctx) {
        String id = ctx.identifier(0).getText();
        result += id;
        if (ctx.RBRACK() != null) {
            result += "[";
        } else {
            if (ctx.DOT() != null && enteredAssign) {
                result += ".put(\""+ctx.identifier(1).getText()+"\",";
                assignToHash = true;
            } else if (!enteredAssign && ctx.DOT() != null) {
                result += ".get(\""+ctx.identifier(1).getText()+"\")";
            }
        }
    }
    
    @Override
    public void exitVariable(simpleParser.VariableContext ctx) {
        if (ctx.RBRACK() != null) {
            result += "]";
        }
        if (enteredAssign) {
            if (!assignToHash) result += " = ";
            enteredAssign = false;
        }
    }
    
    @Override
    public void enterString(simpleParser.StringContext ctx) {
        result += ctx.getText().replaceAll("'","\"");
    }
    
 /*   @Override
    public void enterSimpleExpression(simpleParser.SimpleExpressionContext ctx) {
        result += ctx.getText();
    } */
    
    @Override
    public void enterRelop(simpleParser.RelopContext ctx) {
        result += ctx.getText();
    }
    
    @Override
    public void enterLowop(simpleParser.LowopContext ctx) {
        result += ctx.getText();
    }
    
    @Override
    public void enterHighop(simpleParser.HighopContext ctx) {
        result += ctx.getText();
    }
    
    @Override
    public void enterSignedFactor(simpleParser.SignedFactorContext ctx) {
        if (ctx.PLUS() != null) result += "+";
        if (ctx.MINUS() != null) result += "-";
    }
    
    @Override
    public void enterFactor(simpleParser.FactorContext ctx) {
        if (ctx.NOT() != null) {
            result += "!";
        } else if (ctx.RPAREN() != null) {
            result += "(";
        }
    }
    
    @Override
    public void exitFactor(simpleParser.FactorContext ctx) {
        if (ctx.LPAREN() != null) {
            result += ")";
        }
    }
    
    @Override
    public void enterUnsignedNumber(simpleParser.UnsignedNumberContext ctx) {
        result += ctx.getText();
    }
    
    @Override
    public void enterReturnStatement(simpleParser.ReturnStatementContext ctx) {
        if (activeScope.getParent() != null) {
            result += "return ";
        }
    }
    
    @Override
    public void exitReturnStatement(simpleParser.ReturnStatementContext ctx) {
        if (activeScope.getParent() == null) {
            result = result.substring(0, result.length()-1);
        } else {
            result += ";\n";
        }
    }
    
    @Override
    public void enterAtomicDefinition(simpleParser.AtomicDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        
        result+=toJavaType(type)+" "+id+";\n";
    }
    
    @Override
    public void enterCode(simpleParser.CodeContext ctx) {
        if (activeScope.getParent() == null) {
            result += "public static void main(String args[]) throws Exception {\n";
        };
    }
    
    @Override
    public void enterLoop(simpleParser.LoopContext ctx) {
        result += "while ";
    }
    
    @Override
    public void exitCode(simpleParser.CodeContext ctx) {
        result += "}";
    }
    
  /*  @Override
    public void enterStatementSequence(simpleParser.StatementSequenceContext ctx) {
        if (insideFunction) {
            insideFunction = false;
        } else {
            result += "{\n";
        }
    }
    
    @Override
    public void exitStatementSequence(simpleParser.StatementSequenceContext ctx) {
        result += "}";
    } */
    
    @Override
    public void enterArrayDefinition(simpleParser.ArrayDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = toJavaType(ctx.type().getText());
        String size = ctx.NUM_INT().getText();
        result += type+"[] "+id+" = new "+type+"["+size+"];\n";
    }
    
    @Override
    public void enterConstDefinition(simpleParser.ConstDefinitionContext ctx) {
        String constant = ctx.constant().getText().replaceAll("'","\"");
        String constantType = "String";
        
        if (Pattern.matches("[0-9]+",constant)) {
            constantType = "int";
        } else if (Pattern.matches("[0-9]+.[0-9]+",constant)) {
            constantType = "float";
        }
        
        result += "static final "+constantType+" "+ctx.identifier().getText()+" = ";
    }
    
    @Override
    public void exitConstDefinition(simpleParser.ConstDefinitionContext ctx) {
        result += ";\n";
    }
    
    @Override
    public void enterFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        String type = toJavaType(ctx.type().getText());
        String id = ctx.identifier().getText();
        
        result += type+" "+id+"(";
        
        activeScope = activeScope.findScopeOf(id);
        insideFunction = true;
    }
    
    @Override
    public void exitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        activeScope = activeScope.getParent();
        result += "\n";
    }
    
    @Override
    public void enterArgs(simpleParser.ArgsContext ctx) {
        String type = toJavaType(ctx.type().getText());
        String id = ctx.identifier().getText();
        
        result += type+" "+id+",";
    }
    
    @Override
    public void enterFunctionDecl(simpleParser.FunctionDeclContext ctx) {
        result = result.substring(0,result.length()-1);
        result += ") {\n";
    }
    
    
    @Override
    public void enterAssign(simpleParser.AssignContext ctx) {
        enteredAssign = true;
    }
    
    @Override
    public void exitAssign(simpleParser.AssignContext ctx) {
        enteredAssign = false;
        if (assignToHash) {
            result += ")";
            assignToHash = false;
        }
        result += ";\n";
    }
    
    @Override
    public void enterCondition(simpleParser.ConditionContext ctx) {
        result += "if ";
    }
    
    @Override
    public void enterExpression(simpleParser.ExpressionContext ctx) {
        result += "(";
    }
    
    @Override
    public void exitExpression(simpleParser.ExpressionContext ctx) {
        result += ") {\n";
    }
     
}