import java.util.ArrayList;

public class ScopeListener extends simpleBaseListener {
    
    Scope activeScope;
    String assigmentLeftType;
    boolean assigmentTypeCheck;
    
    public ScopeListener() {
        activeScope = new Scope("Global", null);
        assigmentTypeCheck = false;
        assigmentLeftType = "";
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
        System.out.println("Entered declaration of function "+ctx.identifier().getText());
    }
    
    @Override
    public void exitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        activeScope = activeScope.getParent();
        System.out.println("Leaving the declaration of function "+ctx.identifier().getText());
    }
    
    @Override
    public void enterVariable(simpleParser.VariableContext ctx) {
        String id = ctx.identifier(0).getText();
        Integer line = ctx.getStart().getLine();
        if (!activeScope.contains(id)) {
            System.out.println("ERR( Line "+line+" ): "+id+" does not declared in this scope");
        }
    }
        
    public void printScope() {
        activeScope.print();
    }
}