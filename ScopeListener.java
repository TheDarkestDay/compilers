import java.util.ArrayList;

public class ScopeListener extends simpleBaseListener {
    
    Scope activeScope;
    String assignLeftType;
    boolean assignCheck;
    
    public ScopeListener() {
        activeScope = new Scope("Global", null);
        assignCheck = false;
        assignLeftType = "";
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
        if (assignCheck) {
            String type = activeScope.getTypeOf(id);
            if (assignLeftType == "") {
                assignLeftType = type
            }
            if (assignLeftType != type) {
                System.out.println("ERR( Line "+line+" ): Incompatible types");
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
        if (assignCheck) {
            String id = ctx.identifier().getText();
            String type = activeScope.getTypeOf(id);
            if (type != assignCheck) {
                System.out.println("ERR( Line "+line+" ): Incompatible types");
            }
        }
    }
    
    @Override
    public void enterUnsignedNumber(simpleParser.UnsignedNumberContext ctx) {
        
    }
        
    public void printScope() {
        activeScope.print();
    }
}