import java.util.ArrayList;

public class ScopeListener extends simpleBaseListener {
    
    Scope activeScope;
    String assignLeftType;
    boolean assignCheck;
    boolean returnCheck;
    String expectedType;
    
    public ScopeListener() {
        activeScope = new Scope("Global", null);
        assignCheck = false;
        returnCheck = false;
        assignLeftType = "";
        expectedType = "";
    }
    
    public Scope getScope() {
        return activeScope;
    }
    
    @Override
    public void enterAtomicDefinition(simpleParser.AtomicDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        activeScope.setTypeOf(id,type);
    }
    
    @Override
    public void enterConstDefinition(simpleParser.ConstDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = "constant";
        activeScope.setTypeOf(id,type);
    }
    
    @Override
    public void enterArgs(simpleParser.ArgsContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        activeScope.setTypeOf(id,type);
    }
    
    @Override
    public void enterArrayDefinition(simpleParser.ArrayDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        activeScope.setTypeOf(id,"array of "+type);
    }
    
    @Override
    public void enterDictDefinition(simpleParser.DictDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String typeFirst = ctx.type(0).getText();
        String typeSecond = ctx.type(1).getText();
        activeScope.setTypeOf(id,"<"+typeFirst+","+typeSecond+">");
    }
    
    @Override 
    public void enterFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        String scopeID = ctx.identifier().getText();
        String returnType = ctx.type().getText();
        activeScope.setTypeOf(scopeID, returnType);
        activeScope = activeScope.appendChild(new Scope(scopeID, activeScope));
    }
    
    @Override
    public void exitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        activeScope = activeScope.getParent();
    }
    
    @Override
    public void enterVariable(simpleParser.VariableContext ctx) {
        String id = ctx.identifier(0).getText();
        Integer line = ctx.getStart().getLine();
        if (!activeScope.contains(id)) {
            System.out.println("ERR( Line "+line+" ): "+id+" does not declared in this scope");
        }
        String type = activeScope.getTypeOf(id);
        if (assignCheck) {
            if (assignLeftType.equals("")) {
                assignLeftType = type;
                System.out.println("Expected type is: "+assignLeftType);
            } else {
                if (!assignLeftType.equals(type)) {
                    System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" "+assignLeftType+" "+type);
                }
            }
        } else {
            if (returnCheck) {
                if (!expectedType.equals(type)) {
                    System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" "+expectedType+" "+type);
                }
            }
        }
    }
    
    @Override
    public void enterAssign(simpleParser.AssignContext ctx) {
        assignCheck = true;
        System.out.println("Entered assign");
    }
    
    @Override
    public void exitAssign(simpleParser.AssignContext ctx) {
        assignCheck = false;
        assignLeftType = "";
    }
    
    @Override
    public void enterFunctionCall(simpleParser.FunctionCallContext ctx) {
        String id = ctx.identifier().getText();
        String type = activeScope.getTypeOf(id);
        Integer line = ctx.getStart().getLine();
        if (assignCheck) {
            if (!type.equals(assignLeftType)) {
                System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" "+assignLeftType+" "+type);
            }
        } else {
            if (returnCheck) {
                if (!expectedType.equals(type)) {
                    System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" "+expectedType+" "+type);
                }
            }
        }
    }
    
    @Override
    public void enterUnsignedNumber(simpleParser.UnsignedNumberContext ctx) {
        Integer line = ctx.getStart().getLine();
        if (assignCheck) {
            if (assignLeftType.equals("String")) {
                System.out.println("ERR( Line "+line+" ): Incompatible types ");
            }
        } else {
            if (returnCheck && expectedType.equals("string")) {
                System.out.println("ERR( Line "+line+" ): Incompatible types  "+expectedType+" number");
            }
        }
    }
    
    @Override
    public void enterReturnStatement(simpleParser.ReturnStatementContext ctx) {
        if (activeScope.getParent() != null) {
            returnCheck = true;
            String currFuncName = activeScope.getName();
            expectedType = activeScope.getParent().getTypeOf(currFuncName);
        }
    }
    
    @Override
    public void exitReturnStatement(simpleParser.ReturnStatementContext ctx) {
        returnCheck = false;
    }
    
        
    public void printScope() {
        activeScope.print();
    }
}