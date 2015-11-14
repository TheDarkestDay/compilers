import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.AbstractMap;

public class Scope {
    
    Map<String,String> table;
    ArrayList<Map.Entry<String,String>> arguments;
    ArrayList<Scope> children;
    String name;
    Scope parent;
    
    public Scope(String name, Scope parent) {
        table = new HashMap<String,String>();
        this.name = name;
        this.parent = parent;
        children = new ArrayList<Scope>();
        arguments = new ArrayList<Map.Entry<String,String>>();
    }
    
    public void addArgument(String id, String type) {
        arguments.add(new AbstractMap.SimpleEntry<String,String>(id,type));
    }
    
    public String getArgumentType(Integer i) {
        return arguments.get(i).getValue();
    }
    
    public String getTypeOf(String id) {
        if (table.containsKey(id)) {
            return table.get(id);
        } else {
            if (parent != null) {
                return this.getParent().getTypeOf(id);
            } else {
                return "E";
            }
        }
    }
    
    public boolean contains(String id) {
        if (table.containsKey(id)) {
            return true;
        } else {
            if (parent != null) {
                return parent.contains(id);
            } else {
                return false;
            }
        }
    }
    
    public void setTypeOf(String id, String type) {
        table.put(id,type);
    }
    
    public void print() {
        System.out.println(name.toUpperCase()+" SCOPE:");
        System.out.println("====================================================");
        for (Map.Entry<String,String> entry : table.entrySet()) {
            System.out.println(entry.getKey()+" is a "+entry.getValue());
        };
        System.out.println("ARGS:");
        for (Integer i=0;i<arguments.size();i++) {
            System.out.println(arguments.get(i).getValue()+" "+arguments.get(i).getKey());
        }
        System.out.println("====================================================");
        for (Scope scp : children) {
            scp.print();
        }
    }
    
    public Scope appendChild(Scope newChild) {
        children.add(newChild);
        return newChild;
    }
    
    public Scope getParent() {
        return parent;
    }
    
    public String getName() {
        return name;
    }
    
    public Scope findScopeOf(String funcName) {
        for (Scope scp : children) {
            if (scp.getName().equals(funcName)) {
                return scp;
            } else {
                return scp.findScopeOf(funcName);
            }
        }
        return new Scope(null,null);
    } 
}