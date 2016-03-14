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
    private HashMap<String, String> constLiterals;
    private Stack<String> operators;
    private ArrayList<String> preList;
    private ArrayList<Integer> branchIndexes;
    private Stack<Integer> varCounters;
    private Stack<String> operands;
    private Stack<Integer> listStartIndexes;
    private Scope scp;
    private Stack<BranchInstruction> ifsToTargetOutside;
    private Stack<BranchInstruction> ifsToTargetInside;
    private Stack<Integer> loopStartIndexes;
    private Stack<Boolean> isInside;
    private int subcodeEndIndex;
    private BranchInstruction ifToTargetNear;
    private String lastArrayName;
    
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
    
    private void processLoad(String loadIns) {
        if (loadIns.equals("<AALOAD>")) {
            ils.peek().append(InstructionConstants.AALOAD);
        } else if (loadIns.equals("<IALOAD>")) {
            ils.peek().append(InstructionConstants.IALOAD);
        } else {
            ils.peek().append(InstructionConstants.DALOAD);
        }
    }
    
    private Type toBCELType(String tp) {
        if (tp.contains("array")) {
            tp = tp.substring(0,9);
        }
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
                Type varType;
                
                if (scp.getTypeOf(varName).equals("constant")) {
                    ils.peek().append(_factory.createFieldAccess("Program", varName, getTypeFromLiteral(constLiterals.get(varName)), Constants.GETSTATIC));
                    varType = getTypeFromLiteral(constLiterals.get(varName));
                } else if (scp.getTypeOf(varName).contains("array")) {
                    int arrIndex = variables.peek().get(varName);
                    varType = toBCELType(scp.getTypeOf(varName));
                    ils.peek().append(_factory.createLoad(Type.OBJECT, arrIndex));
                } else {
                    int varIndex = variables.peek().get(varName);
                    varType = toBCELType(scp.getTypeOf(varName));
                    ils.peek().append(_factory.createLoad(varType, varIndex));
                }
                
                if (lastExprType.toString().equals("double") && varType == Type.INT) {
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
            } else if (preList.get(i).contains("LOAD")) {
                processLoad(preList.get(i));
            } else {
                if (lastExprType.toString().equals("double")) {
                    processDblOp(preList.get(i));
                } else {
                    processIntOp(preList.get(i));
                }
            }
        }
    }
    
    private Type getTypeFromLiteral(String literal) {
        if (Pattern.matches("[a-zA-Z]+", literal)) {
            return Type.STRING;
        } else if (Pattern.matches("[0-9]+", literal)) {
            return Type.INT;
        } else {
            return Type.DOUBLE;
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
        constLiterals = new HashMap<String, String>();
        operators = new Stack<String>();
        varCounters = new Stack<Integer>();
        operands = new Stack<String>();
        preList = new ArrayList<String>();
        ifsToTargetOutside = new Stack<BranchInstruction>();
        ifsToTargetInside = new Stack<BranchInstruction>();
        isInside = new Stack<Boolean>();
        loopStartIndexes = new Stack<Integer>();
        listStartIndexes = new Stack<Integer>();
        ifToTargetNear = null;
        branchIndexes = new ArrayList<Integer>();
        isInside.push(true);
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
        if (name.contains("[")) {
            name = name.substring(0,name.indexOf("["));
        }
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
            case "array of number":
                ils.peek().append(InstructionConstants.IASTORE);
                break;
            case "array of real":
                ils.peek().append(InstructionConstants.DASTORE);
                break;
            case "array of string":
                ils.peek().append(InstructionConstants.AASTORE);
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
            
            String leftVarName = ctx.identifier(0).getText();
            String leftVarType = scp.getTypeOf(leftVarName);
        
            if (leftVarType.contains("array")) {
                ils.peek().append(_factory.createLoad(Type.OBJECT, variables.peek().get(leftVarName)));
            }
        } else {
            String varName = ctx.identifier(0).getText();
            String varType = scp.getTypeOf(varName); 
            if (varType.contains("real")) {
                lastExprType = Type.DOUBLE;
            }
            if (varType.contains("string")) {
                lastExprType = Type.STRING;
            }
            if (varType.contains("constant")) {
                if (getTypeFromLiteral(constLiterals.get(ctx.getText())) == Type.DOUBLE) {
                    lastExprType = Type.DOUBLE;
                } else if (getTypeFromLiteral(constLiterals.get(ctx.getText())) == Type.STRING) {
                    lastExprType = Type.STRING;
                };
            }
            
            if (varType.contains("array")) {
                lastArrayName = varName;
            }
            
            preList.add(ctx.identifier(0).getText());
        }
    }
    
    @Override
    public void exitArrayIndex(simpleParser.ArrayIndexContext ctx) {
        if (!leftSideOfAssign) {
            String lastArrType = scp.getTypeOf(lastArrayName);
            if (lastArrType.contains("number")) {
                preList.add("<IALOAD>");
            } else if (lastArrType.contains("real")) {
                preList.add("<DALOAD>");
            } else {
                preList.add("<AALOAD>");
            }
        }
    }
    
    @Override
    public void exitProgram(simpleParser.ProgramContext ctx) {
        InstructionList il = ils.peek();
        MethodGen method = methods.peek();
        
       /* for (int i=0;i<ils.peek().getLength();i++) {
            System.out.println(ils.peek().getInstructionHandles()[i]);
        } */
        
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
        String literal = ctx.getText().replaceAll("'","");
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
        if (listStartIndexes.empty()) {
            lastExprType = Type.INT;
        }
        listStartIndexes.push(operators.size());
    }
    
    @Override
    public void enterConstDefinition(simpleParser.ConstDefinitionContext ctx) {
        FieldGen field;
        
        String rawConst = ctx.constant().getText().replaceAll("'","");
        String constName = ctx.identifier().getText();
        Type tp = getTypeFromLiteral(rawConst);
        constLiterals.put(constName, rawConst);
        
        System.out.println(rawConst);
        System.out.println(constName);
        System.out.println(tp);
        
        field = new FieldGen(ACC_PUBLIC | ACC_STATIC | ACC_FINAL, tp, constName, _cp);
        
        switch(tp.toString()) {
            case "int":
                field.setInitValue(Integer.parseInt(rawConst));
                break;
            case "double":
                field.setInitValue(Double.parseDouble(rawConst));
                break;
            default:
                field.setInitValue(rawConst);
        }
        
        _cg.addField(field.getField());
    }
    
    @Override
    public void exitSimpleExpression(simpleParser.SimpleExpressionContext ctx) {
        while (operators.size() != listStartIndexes.peek()) {
            preList.add(operators.pop());
        }
        
        listStartIndexes.pop();
        
        if (!lastExprType.toString().equals("string") && listStartIndexes.size() == 0) {
            processList();
            preList.clear();
        }
    }
    
    
    @Override
    public void exitExpressionBlock(simpleParser.ExpressionBlockContext ctx) {
    //    if (ctx.simpleExpression == null) {
            String relOp = ctx.relop().getText();
            
            switch(relOp) {
                case ">":
                    ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPGT, null));
                    break;
                case "<":
                    ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPLT, null));
                    break;
                case ">=":
                    ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPGE, null));
                    break;
                case "<=":
                    ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPLE, null));
                    break;
                case "=":
                    ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPEQ, null));
                    break;
                case "!=":
                    ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPNE, null));
                    break;
            }
            
            ils.peek().append(ifsToTargetOutside.peek());
            branchIndexes.add(ils.peek().getLength()-1);
        
            if (ifToTargetNear != null) {
                ifToTargetNear.setTarget(ils.peek().getEnd());
            }
         //   ifsToTargetOutside.pop();
    //    }
    }
    
    @Override
    public void enterLogop(simpleParser.LogopContext ctx) {
        String op = ctx.getText();
        
        if (op.equals("and")) {
            ifToTargetNear = ifsToTargetOutside.pop();
        } else {
            ifsToTargetInside.push(ifsToTargetOutside.pop());
            ifToTargetNear = null;
        }
    }
    
    @Override
    public void enterSubCode(simpleParser.SubCodeContext ctx) {
        isInside.push(true);
    }
    
    
    @Override
    public void exitSubCode(simpleParser.SubCodeContext ctx) {
        isInside.pop();
        isInside.push(false);
        subcodeEndIndex = ils.peek().getLength()-1;
    }
    
    @Override
    public void exitStatement(simpleParser.StatementContext ctx) {
        if (!isInside.peek()) {
            if (ils.peek().getInstructionHandles()[subcodeEndIndex+1].toString().contains("goto")) {
                ifsToTargetOutside.peek().setTarget(ils.peek().getInstructionHandles()[subcodeEndIndex+2]);
            } else {
                ifsToTargetOutside.peek().setTarget(ils.peek().getInstructionHandles()[subcodeEndIndex+1]);
            }
            isInside.pop();
        }
        
        while(!ifsToTargetInside.empty()) {
            int lastBranchIndex = branchIndexes.get(branchIndexes.size()-1);
            ifsToTargetInside.peek().setTarget(ils.peek().getInstructionHandles()[lastBranchIndex+1]);
            ifsToTargetInside.pop();
        }
    }
    
    @Override
    public void exitExpression(simpleParser.ExpressionContext ctx) {
        String branchIns = ils.peek().getEnd().getInstruction().getName().toUpperCase();
        
        switch(branchIns) {
            case "IF_ICMPLE":
                ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPGT, null));
                break;
            case "IF_CMPGE":
                ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPLT, null));
                break;
            case "IF_ICMPGT":
                ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPLE, null));
                break;
            case "IF_ICMPLT":
                ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPGE, null));
                break;
            case "IF_ICMPEQ":
                ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPNE, null));
                break;
            case "IF_ICMPNE":
                ifsToTargetOutside.push(_factory.createBranchInstruction(Constants.IF_ICMPEQ, null));
                break;
        }
        
        try {
            if (ifToTargetNear != null)
                ifToTargetNear.setTarget(null);
            ils.peek().delete(ils.peek().getEnd());
        } catch (TargetLostException e) {
            System.out.println("Caught");
        }
        
        ils.peek().append(ifsToTargetOutside.peek());
    
        if (ifToTargetNear != null) {
            int preLastBranchIndex = branchIndexes.get(branchIndexes.size()-2);
            ifToTargetNear.setTarget(ils.peek().getInstructionHandles()[preLastBranchIndex+1]);
        }
            
      //  branchIndexes.clear();
    }
    
    @Override
    public void enterLoop(simpleParser.LoopContext ctx) {
        loopStartIndexes.push(ils.peek().getLength());
    }
    
    @Override
    public void exitLoop(simpleParser.LoopContext ctx) {
        int labelForGoTo = loopStartIndexes.pop();
        ils.peek().append(_factory.createBranchInstruction(Constants.GOTO, ils.peek().getInstructionHandles()[labelForGoTo]));
        
        /*for (int i=0;i<ils.peek().getLength();i++) {
            System.out.println(ils.peek().getInstructionHandles()[i]);
        }*/
        
    }
    
    @Override
    public void enterArrayDefinition(simpleParser.ArrayDefinitionContext ctx) {
        int size = Integer.parseInt(ctx.NUM_INT().getText());
        int varIndex = varCounters.pop();
        String type = scp.getTypeOf(ctx.identifier().getText());
        Type tp = Type.INT;
        
        ils.peek().append(new PUSH(_cp, size));
        if (type.contains("real")) {
            tp = Type.DOUBLE;
        } else if (type.contains("string")) {
            tp = Type.STRING;
        }
        
        
        ils.peek().append(_factory.createNewArray(tp, (short) 1));
        varIndex++;
        ils.peek().append(_factory.createStore(Type.OBJECT, varIndex));
        varCounters.push(varIndex);
        variables.peek().put(ctx.identifier().getText(), varIndex);
    }
    
}