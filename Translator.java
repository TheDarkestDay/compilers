

public class Translator extends simpleBaseListener {
    
    
    Scope activeScope;
    String result;
    
    public Translator() {
        result="import java.utils.ArrayList;\nimport java.util.HashMap;\n\n";
    }
    
    public void setScope(Scope scope) {
        activeScope = scope;
    } 
    
    public String getResult() {
        return result;
    }
    
    
    @Override
    public void enterProgram(simpleParser.ProgramContext ctx) {
        if (activeScope.getParent() == null) {
            result += "public class Program {\n";
        }
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
    
  /*  @Override
    public void enterVariable(simpleParser.VariableContext ctx) {
        translatedString+=;
    } */
     
}