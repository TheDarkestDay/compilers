import java.util.ArrayList;

public class ScopeListener extends simpleBaseListener {
    
    Scope activeScope;
    String assignLeftType;
    boolean assignCheck;
    boolean returnCheck;
    boolean argsCheck;
    Integer argsCounter;
    String expectedType;
    Scope thisFunctionScope;
    
    public ScopeListener() {
        activeScope = new Scope("Global", null);
        assignCheck = false;
        returnCheck = false;
        argsCheck = false;
        assignLeftType = "";
        expectedType = "";
        argsCounter = 0;
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
        activeScope.addArgument(id,type);
        System.out.println("Argument added");
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
        String typeFirst = ctx.type().getText();
        activeScope.setTypeOf(id,typeFirst);
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
        String id = ctx.identifier().getText();
        Integer line = ctx.getStart().getLine();
        if (!activeScope.contains(id)) {
            System.out.println("ERR( Line "+line+" ): "+id+" does not declared in this scope");
        }
        String type = activeScope.getTypeOf(id);
        if (assignCheck) {
            if (assignLeftType.equals("")) {
                assignLeftType = type;
            } else {
                if (!assignLeftType.equals(type)) {
                    System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" expected "+assignLeftType+" but got "+type);
                }
            }
        } else {
            if (returnCheck) {
                if (!expectedType.equals(type)) {
                    System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" expected "+expectedType+" but got "+type);
                }
            }
        }
        if (argsCheck) {
            if(!expectedType.equals(type)) {
                System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" expected "+expectedType+" but got "+type);
            }
        } 
    }
    
    @Override
    public void enterAssign(simpleParser.AssignContext ctx) {
        assignCheck = true;
    }
    
    @Override
    public void exitAssign(simpleParser.AssignContext ctx) {
        assignCheck = false;
        assignLeftType = "";
    }
    
    @Override
    public void enterFunctionCall(simpleParser.FunctionCallContext ctx) {
        String id = ctx.identifier().getText();
        thisFunctionScope = activeScope.findScopeOf(id);
        String type = activeScope.getTypeOf(id);
        Integer line = ctx.getStart().getLine();
        argsCounter = 0;
        if (assignCheck) {
            if (!type.equals(assignLeftType)) {
                System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" expected  "+assignLeftType+" but got "+type);
            }
        } else {
            if (returnCheck) {
                if (!expectedType.equals(type)) {
                    System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" expected "+expectedType+" but got "+type);
                }
            }
        }
        if (argsCheck) {
            if (!type.equals(expectedType)) {
                System.out.println("ERR( Line "+line+" ): Incompatible types "+id+" expected "+expectedType+" but got "+type);
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
                System.out.println("ERR( Line "+line+" ): Incompatible types  "+expectedType+" expected but got number");
            } 
        }
        if (argsCheck) {
            if (expectedType.equals("string")) {
                System.out.println("ERR( Line "+line+" ): Incompatible types  "+expectedType+" expected but got number");
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
    
    @Override
    public void enterArgsList(simpleParser.ArgsListContext ctx) {
        argsCheck = true;
    }
    
    @Override
    public void enterArgument(simpleParser.ArgumentContext ctx) {
        expectedType = thisFunctionScope.getArgumentType(argsCounter);
        argsCounter++;
        System.out.println("Entered argument");
    }
    
    @Override
    public void exitArgsList(simpleParser.ArgsListContext ctx) {
        argsCheck = false;
    }
    
        
    public void printScope() {
        activeScope.print();
    }
}