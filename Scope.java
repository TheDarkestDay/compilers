import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Scope {
    
    Map<String,String> table;
    ArrayList<Scope> children;
    String name;
    Scope parent;
    
    public Scope(String name, Scope parent) {
        table = new HashMap<String,String>();
        this.name = name;
        this.parent = parent;
        children = new ArrayList<Scope>();
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
    
 /*   public String find(String scopeName, String id) {
        for (Scope scp : children) {
            if (scp.getName() == scopeName) {
                return scp.getTypeOf(id);
            } else {
                return scp.find(scopeName,id);
            }
        }
        return "E";
    } */
}