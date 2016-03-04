import java.util.*;
import org.apache.bcel.*;
import org.apache.bcel.generic.*;
import org.apache.bcel.classfile.*;
import java.io.FileOutputStream;
import static org.apache.bcel.Constants.*;

public class BytecodeWriter extends simpleBaseListener {
    
    private InstructionFactory _factory;
    private ConstantPoolGen    _cp;
    private ClassGen           _cg;
    
    private Stack<InstructionList> ils;
    private Stack<MethodGen> methods;
    private Stack<HashMap<String, Integer>> variables;
    
    
    public BytecodeWriter() {
        _cg = new ClassGen("Program", "java.lang.Object", "Program.java", ACC_PUBLIC | ACC_SUPER, new String[] {  });

        _cp = _cg.getConstantPool();
        _factory = new InstructionFactory(_cg, _cp);
        
        InstructionList il = new InstructionList();
        MethodGen method = new MethodGen(ACC_PUBLIC, Type.VOID, Type.NO_ARGS, new String[] {  }, "<init>", "Program", il, _cp);

        InstructionHandle ih_0 = il.append(_factory.createLoad(Type.OBJECT, 0));
        il.append(_factory.createInvoke("java.lang.Object", "<init>", Type.VOID, Type.NO_ARGS, Constants.INVOKESPECIAL));
        InstructionHandle ih_4 = il.append(_factory.createReturn(Type.VOID));
        method.setMaxStack();
        method.setMaxLocals();
        _cg.addMethod(method.getMethod());
        il.dispose();
        
        ils = new Stack<InstructionList>();
        methods = new Stack<MethodGen>();
        variables = new Stack<HashMap<String, Integer>>();
    }
    
    public void writeClass() throws Exception {
        _cg.getJavaClass().dump(new FileOutputStream("Program.class"));
    }
    
/*    public byte[] getBytecode() {
    } */
    
    @Override
    public void enterProgram(simpleParser.ProgramContext ctx) { 
        InstructionList il = new InstructionList();
        MethodGen method = new MethodGen(ACC_PUBLIC | ACC_STATIC, Type.VOID, new Type[] { new ArrayType(Type.STRING, 1) }, new String[] { "arg0" }, "main", "Program", il, _cp);
        
        ils.push(il);
        methods.push(method);
        variables.push(new HashMap<String, Integer>());
    }
    
    @Override
    public void exitProgram(simpleParser.ProgramContext ctx) {
        InstructionList il = ils.peek();
        MethodGen method = methods.peek();
        
        il.append(_factory.createReturn(Type.VOID));
        method.setMaxStack();
        method.setMaxLocals();
        _cg.addMethod(method.getMethod());
        il.dispose();
    } 
    
    @Override
    public void enterOutput(simpleParser.OutputContext ctx) {
        ils.peek().append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    }
    
    @Override
    public void enterString(simpleParser.StringContext ctx) {
        String literal = ctx.getText();
        ils.peek().append(new PUSH(_cp, literal));
    }
    
    @Override
    public void exitOutput(simpleParser.OutputContext ctx) {
        ils.peek().append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
    }
}