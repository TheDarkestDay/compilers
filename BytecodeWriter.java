import java.util.*;
import java.util.regex.Pattern;
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
    private ArrayList<String> preList;
    private Stack<Integer> varCounters;
    private Stack<String> operands;
    private Scope scp;
    
    boolean leftSideOfAssign;
    Type lastExprType;
    
    
    private void processIntOp(String op) {
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
    
    private void processDblOp(String op) {
        switch(op) {
            case "+":
                ils.peek().append(InstructionConstants.DADD);
                break;
            case "*":
                ils.peek().append(InstructionConstants.DMUL);
                break;
            case "/":
                ils.peek().append(InstructionConstants.DDIV);
                break;
            case "-":
                ils.peek().append(InstructionConstants.DSUB);
                break;
        }
    }
    
    private Type toBCELType(String tp) {
        switch(tp) {
            case "number":
                return Type.INT;
            case "string":
                return Type.OBJECT;
            case "real":
                return Type.DOUBLE;
        }
        return Type.INT;
    }
    
    private void processList() {
        for (int i = 0;i<preList.size();i++) {
            if (Pattern.matches("[a-zA-Z]+", preList.get(i))) {
                String varName = preList.get(i);
                String varType = scp.getTypeOf(varName);
                int varIndex = variables.peek().get(varName);
                
                ils.peek().append(_factory.createLoad(toBCELType(varType), varIndex));
                if (lastExprType.toString().equals("double") && varType.equals("number")) {
                    ils.peek().append(InstructionConstants.I2D);
                }
            } else if (Pattern.matches("[0-9]{1,13}(\\.[0-9]+)?", preList.get(i))) {
                if (lastExprType.toString().equals("double") && !preList.get(i).contains(".")) {
                    ils.peek().append(new PUSH(_cp, Double.parseDouble(preList.get(i)+".0")));
                } else if (preList.get(i).contains(".")) {
                    ils.peek().append(new PUSH(_cp, Double.parseDouble(preList.get(i))));
                } else {
                    ils.peek().append(new PUSH(_cp, Integer.parseInt(preList.get(i))));
                }        
            } else {
                if (lastExprType.toString().equals("double")) {
                    processDblOp(preList.get(i));
                } else {
                    processIntOp(preList.get(i));
                }
            }
        }
    }
    
    public BytecodeWriter(Scope scope) {
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
        
        scp = scope;
        leftSideOfAssign = false;
        lastExprType = Type.INT;
        
        ils = new Stack<InstructionList>();
        methods = new Stack<MethodGen>();
        variables = new Stack<HashMap<String, Integer>>();
        operators = new Stack<String>();
        varCounters = new Stack<Integer>();
        operands = new Stack<String>();
        preList = new ArrayList<String>();
        varCounters.push(0);
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
    public void exitAtomicDefinition(simpleParser.AtomicDefinitionContext ctx) {
        String varType = ctx.type().getText();
        String varName = ctx.identifier().getText();
        int varIndex = varCounters.pop();
        
        varIndex++;
        if (varType.equals("real")) {
            varIndex += 2;
            varCounters.push(varIndex);
            variables.peek().put(varName, varCounters.peek()-1);
        } else {
            varIndex++;
            varCounters.push(varIndex);
            variables.peek().put(varName, varCounters.peek());
        }
    }
    
    @Override
    public void exitAssign(simpleParser.AssignContext ctx) {
        String name = ctx.variable().getText();
        int varIndex = variables.peek().get(name);
        String varType = scp.getTypeOf(name);
        
        switch(varType) {
            case "number":
                ils.peek().append(_factory.createStore(Type.INT, varIndex));
                break;
            case "string":
                ils.peek().append(_factory.createStore(Type.OBJECT, varIndex));
                break;
            case "real":
                ils.peek().append(_factory.createStore(Type.DOUBLE, varIndex));
                break;
        }
    }
    
    @Override
    public void enterAssign(simpleParser.AssignContext ctx) {
        leftSideOfAssign = true;
    }
    
    @Override
    public void exitVariable(simpleParser.VariableContext ctx) {
        if (leftSideOfAssign) {
            leftSideOfAssign = false;
        } else {
            String varName = ctx.identifier(0).getText();
            String varType = scp.getTypeOf(varName); 
            if (varType.equals("real")) {
                lastExprType = Type.DOUBLE;
            }
            if (varType.equals("string")) {
                lastExprType = Type.STRING;
            }
        /*    int varIndex = variables.peek().get(varName); 
            ils.peek().append(_factory.createLoad(toBCELType(varType), varIndex)); */
            
            preList.add(ctx.identifier(0).getText());
        }
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
        lastExprType = Type.INT;

        ils.peek().append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    }
    
    @Override
    public void enterString(simpleParser.StringContext ctx) {
        String literal = ctx.getText();
        lastExprType = Type.STRING;
        ils.peek().append(new PUSH(_cp, literal));
    }
    
    
    @Override
    public void exitOutput(simpleParser.OutputContext ctx) {        
        ils.peek().append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] {lastExprType}, Constants.INVOKEVIRTUAL));
    }
    
    @Override
    public void enterUnsignedNumber(simpleParser.UnsignedNumberContext ctx) {
        String rawVar = ctx.getText();
   /*     if (rawVar.contains(".")) {
            ils.peek().append(new PUSH(_cp, Double.parseDouble(rawVar)));
            lastExprType = Type.DOUBLE;
        } else {
            ils.peek().append(new PUSH(_cp, Integer.parseInt(rawVar)));
        } */
        
        if (rawVar.contains(".")) {
            lastExprType = Type.DOUBLE;
        }
        
        preList.add(rawVar);
    }
    
    @Override
    public void enterLowop(simpleParser.LowopContext ctx) {
        String op = ctx.getText();
        
        while(!operators.empty()) {
            preList.add(operators.pop());
        }
        
        operators.push(op);
    }
    
    @Override
    public void enterHighop(simpleParser.HighopContext ctx) {
        String op = ctx.getText();
        
        if (!operators.empty()) {
            while (operators.peek().equals("*") || operators.peek().equals("/")) {
                preList.add(operators.pop());
            }
        }
        
        operators.push(op);
    }
    
    @Override
    public void enterSimpleExpression(simpleParser.SimpleExpressionContext ctx) {
        preList.clear();
    }
    
    @Override
    public void exitSimpleExpression(simpleParser.SimpleExpressionContext ctx) {
        while (!operators.empty()) {
            preList.add(operators.pop());
        }
        
        processList();
    }
}