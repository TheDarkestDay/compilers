

public class TypeVisitor extends simpleBaseVisitor {
    
    Scope scope;
    String currentScopeName;
    
    public TypeVisitor(Scope scp) {
        scope = scp;
    }
    
    @Override
    public Integer visitAssign(simpleParser.AssignContext ctx) {
        String leftType = visit(ctx.variable());
        System.out.println(leftType);
    }
    
    @Override
    public Integer visitVariable(simpleParser.VariableContext ctx) {
        String id = ctx.identifier(0).getText();
        return scope.getTypeOf(id);
    }
    
  /*  @Override
    public Integer visitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        String typeToReturn = ctx.type().getText();
        String actualyReturned = visit(ctx.code());
        if (typeToReturn != actualyReturned) {
            System.out.println("ERR");
        }
    }
    
    @Override
    public Integer visitSimpleExpression(simpleParser.SimpleExpressionContext ctx) {
        
    } */
}