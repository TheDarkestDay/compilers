import java.util.HashMap;
import java.util.Map;



public class AttrVisitor extends simpleBaseVisitor<Integer> {
    
    Map<String,String> map = new HashMap<String,String>();
    
    @Override
    public Integer visitAtomicDefinition(simpleParser.AtomicDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        if (map.get(id) == "Function") {
            System.out.println("Error");
        } else {
            map.put(id,"Variable");
        }
        return visitChildren(ctx);
    }
    
    @Override
    public Integer visitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        if (map.get(id) == "Variable") {
            System.out.println("Error");
        } else {
            map.put(id,"Function");
        }
        return visitChildren(ctx);
    }
};