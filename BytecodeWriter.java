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
    private Stack<String> operators;
    
    
    private void processOp(String op) {
        switch(op) {
            case "+":
                ils.peek().append(InstructionConstants.IADD);
                break;
            case "*":
                ils.peek().append(InstructionConstants.IMUL);
                break;
            case "/":
                ils.peek().append(InstructionConstants.IDIV);
                break;
            case "-":
                ils.peek().append(InstructionConstants.ISUB);
                break;
        }
    }
    
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
        operators = new Stack<String>();
    }
    
    public void writeClass() throws Exception {
        _cg.getJavaClass().dump(new FileOutputStream("Program.class"));
    }
    
    
    
    
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
        Type[] argType = new Type[] { Type.INT };
        if (ctx.string() != null) {
            argType[0] = Type.STRING;
        }
        ils.peek().append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, argType, Constants.INVOKEVIRTUAL));
    }
    
    @Override
    public void enterUnsignedNumber(simpleParser.UnsignedNumberContext ctx) {
        ils.peek().append(new PUSH(_cp, Integer.parseInt(ctx.getText())));
    }
    
    @Override
    public void enterLowop(simpleParser.LowopContext ctx) {
        String op = ctx.getText();
        
        if (!operators.empty() && (operators.peek() == "+" || operators.peek() == "-")) {
            while (!operators.empty()) {
                processOp(operators.pop());
            }
        }
        
        operators.push(op);
    }
    
    @Override
    public void enterHighop(simpleParser.HighopContext ctx) {
        String op = ctx.getText();
        
        if (!operators.empty()) {
            while (operators.peek() == "*" || operators.peek() == "/") {
                processOp(operators.pop());
            }
        }
        
        operators.push(op);
    }
    
    @Override
    public void exitExpression(simpleParser.ExpressionContext ctx) {
        while (!operators.empty()) {
            processOp(operators.pop());
        }
    }
}