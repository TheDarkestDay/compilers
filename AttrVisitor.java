import java.util.HashMap;
import java.util.Map;



public class AttrVisitor extends simpleBaseVisitor<Integer> {
    
    Map<String,String> map = new HashMap<String,String>();
    
    public void printMap() {
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" is a "+entry.getValue());
        };
    }
    
    @Override
    public Integer visitAtomicDefinition(simpleParser.AtomicDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        Integer line = ctx.getStart().getLine();
        map.put(id,type);
        return visitChildren(ctx);
    }
    
    @Override
    public Integer visitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        Integer line = ctx.getStart().getLine();
        map.put(id,"function that returns "+type);
        return visitChildren(ctx);
    }
    
    @Override
    public Integer visitArrayDefinition(simpleParser.ArrayDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        String type = ctx.type().getText();
        Integer line = ctx.identifier().getStart().getLine();
        map.put(id,"array of "+type);
        return visitChildren(ctx);
    }
    
    @Override
    public Integer visitDictDefinition(simpleParser.DictDefinitionContext ctx) {
        String id = ctx.identifier().getText();
        Integer line = ctx.getStart().getLine();
        String typeFirst = ctx.type(0).getText();
        String typeSecond = ctx.type(1).getText();
        map.put(id,"dictionary of "+typeFirst+", "+typeSecond);
        return visitChildren(ctx);
    }
    
    @Override
    public Integer visitFunctionCall(simpleParser.FunctionCallContext ctx) {
        String id = ctx.identifier().getText();
        Integer line = ctx.getStart().getLine();
        if (map.get(id) == "Variable") 
            System.out.println("ERR ( Line "+line+") "+id+" previously defined as variable");
        return visitChildren(ctx);
    }
        
    @Override
    public Integer visitVariable(simpleParser.VariableContext ctx) {
        String id_first = ctx.identifier(0).getText();
        Integer line = ctx.getStart().getLine();
        if (map.get(id_first) == "Function") 
            System.out.println("ERR ( Line "+line+") "+id_first+" previously defined as function");
        return visitChildren(ctx);
    }
};