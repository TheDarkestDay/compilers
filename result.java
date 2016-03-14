import org.apache.bcel.generic.*;
import org.apache.bcel.classfile.*;
import org.apache.bcel.*;
import java.io.*;

public class BCELTestCreator implements Constants {
  private InstructionFactory _factory;
  private ConstantPoolGen    _cp;
  private ClassGen           _cg;

  public BCELTestCreator() {
    _cg = new ClassGen("BCELTest", "java.lang.Object", "BCELTest.java", ACC_PUBLIC | ACC_SUPER, new String[] {  });

    _cp = _cg.getConstantPool();
    _factory = new InstructionFactory(_cg, _cp);
  }

  public void create(OutputStream out) throws IOException {
    createFields();
    createMethod_0();
    createMethod_1();
    createMethod_2();
    _cg.getJavaClass().dump(out);
  }

  private void createFields() {
    FieldGen field;

    field = new FieldGen(ACC_PUBLIC | ACC_STATIC | ACC_FINAL, Type.INT, "CONST", _cp);
    field.setInitValue(12)
    _cg.addField(field.getField());
  }

  private void createMethod_0() {
    InstructionList il = new InstructionList();
    MethodGen method = new MethodGen(ACC_PUBLIC, Type.VOID, Type.NO_ARGS, new String[] {  }, "<init>", "BCELTest", il, _cp);

    InstructionHandle ih_0 = il.append(_factory.createLoad(Type.OBJECT, 0));
    il.append(_factory.createInvoke("java.lang.Object", "<init>", Type.VOID, Type.NO_ARGS, Constants.INVOKESPECIAL));
    InstructionHandle ih_4 = il.append(_factory.createReturn(Type.VOID));
    method.setMaxStack();
    method.setMaxLocals();
    _cg.addMethod(method.getMethod());
    il.dispose();
  }

  private void createMethod_1() {
    InstructionList il = new InstructionList();
    MethodGen method = new MethodGen(ACC_PUBLIC | ACC_STATIC, Type.DOUBLE, new Type[] { Type.INT, Type.DOUBLE }, new String[] { "arg0", "arg1" }, "greet", "BCELTest", il, _cp);

    InstructionHandle ih_0 = il.append(new PUSH(_cp, 1));
    il.append(_factory.createStore(Type.INT, 3));
    InstructionHandle ih_2 = il.append(_factory.createLoad(Type.INT, 0));
    il.append(InstructionConstants.I2D);
    il.append(_factory.createLoad(Type.DOUBLE, 1));
    il.append(InstructionConstants.DMUL);
    il.append(new PUSH(_cp, 3.0));
    il.append(InstructionConstants.DADD);
    InstructionHandle ih_10 = il.append(_factory.createReturn(Type.DOUBLE));
    method.setMaxStack();
    method.setMaxLocals();
    _cg.addMethod(method.getMethod());
    il.dispose();
  }

  private void createMethod_2() {
    InstructionList il = new InstructionList();
    MethodGen method = new MethodGen(ACC_PUBLIC | ACC_STATIC, Type.VOID, new Type[] { new ArrayType(Type.STRING, 1) }, new String[] { "arg0" }, "main", "BCELTest", il, _cp);

    InstructionHandle ih_0 = il.append(new PUSH(_cp, 2));
    il.append(new PUSH(_cp, 3.4));
    il.append(_factory.createInvoke("BCELTest", "greet", Type.DOUBLE, new Type[] { Type.INT, Type.DOUBLE }, Constants.INVOKESTATIC));
    il.append(_factory.createStore(Type.DOUBLE, 1));
    InstructionHandle ih_8 = il.append(new PUSH(_cp, 4));
    il.append(_factory.createStore(Type.INT, 4));
    InstructionHandle ih_11 = il.append(new PUSH(_cp, 8));
    il.append(_factory.createStore(Type.INT, 5));
    InstructionHandle ih_15 = il.append(new PUSH(_cp, 10));
    il.append(_factory.createStore(Type.INT, 6));
    InstructionHandle ih_19 = il.append(new PUSH(_cp, 10));
    il.append(_factory.createNewArray(Type.INT, (short) 1));
    il.append(_factory.createStore(Type.OBJECT, 7));
    InstructionHandle ih_25 = il.append(new PUSH(_cp, 25));
    il.append(_factory.createNewArray(Type.INT, (short) 1));
    il.append(_factory.createStore(Type.OBJECT, 8));
    InstructionHandle ih_31 = il.append(new PUSH(_cp, 21));
    il.append(_factory.createNewArray(Type.DOUBLE, (short) 1));
    il.append(_factory.createStore(Type.OBJECT, 9));
    InstructionHandle ih_37 = il.append(new PUSH(_cp, 12));
    il.append(_factory.createNewArray(Type.STRING, (short) 1));
    il.append(_factory.createStore(Type.OBJECT, 10));
    InstructionHandle ih_44 = il.append(_factory.createLoad(Type.OBJECT, 7));
    il.append(new PUSH(_cp, 1));
    il.append(new PUSH(_cp, 15));
    il.append(InstructionConstants.IASTORE);
    InstructionHandle ih_50 = il.append(new PUSH(_cp, 1.5));
    il.append(_factory.createLoad(Type.OBJECT, 7));
    il.append(new PUSH(_cp, 1));
    il.append(InstructionConstants.IALOAD);
    il.append(InstructionConstants.I2D);
    il.append(InstructionConstants.DMUL);
    il.append(_factory.createStore(Type.DOUBLE, 11));
    InstructionHandle ih_61 = il.append(_factory.createLoad(Type.OBJECT, 9));
    il.append(new PUSH(_cp, 1));
    il.append(new PUSH(_cp, 2.1));
    il.append(InstructionConstants.DASTORE);
    InstructionHandle ih_68 = il.append(_factory.createLoad(Type.OBJECT, 10));
    il.append(new PUSH(_cp, 1));
    il.append(new PUSH(_cp, "Blah"));
    il.append(InstructionConstants.AASTORE);
    InstructionHandle ih_74 = il.append(new PUSH(_cp, "Haha"));
    il.append(_factory.createStore(Type.OBJECT, 13));
    InstructionHandle ih_78 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, 6.0));
    il.append(_factory.createLoad(Type.DOUBLE, 1));
    il.append(new PUSH(_cp, 33.4));
    il.append(InstructionConstants.DMUL);
    il.append(InstructionConstants.DADD);
    il.append(new PUSH(_cp, 12.0));
    il.append(InstructionConstants.DADD);
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.DOUBLE }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_97 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, "Hello, world!"));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_105 = il.append(_factory.createLoad(Type.INT, 4));
    il.append(new PUSH(_cp, 20));
        BranchInstruction if_icmpgt_109 = _factory.createBranchInstruction(Constants.IF_ICMPGT, null);
    il.append(if_icmpgt_109);
    il.append(_factory.createLoad(Type.INT, 4));
    il.append(new PUSH(_cp, 100));
        BranchInstruction if_icmpge_116 = _factory.createBranchInstruction(Constants.IF_ICMPGE, null);
    il.append(if_icmpge_116);
    InstructionHandle ih_119 = il.append(_factory.createLoad(Type.INT, 4));
    il.append(new PUSH(_cp, 1));
    il.append(InstructionConstants.IADD);
    il.append(_factory.createStore(Type.INT, 4));
        BranchInstruction goto_125 = _factory.createBranchInstruction(Constants.GOTO, ih_105);
    il.append(goto_125);
    InstructionHandle ih_128 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, "Hello, world!"));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_136 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, 12));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.INT }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_144 = il.append(_factory.createReturn(Type.VOID));
    if_icmpgt_109.setTarget(ih_119);
    if_icmpge_116.setTarget(ih_128);
    method.setMaxStack();
    method.setMaxLocals();
    _cg.addMethod(method.getMethod());
    il.dispose();
  }

  public static void main(String[] args) throws Exception {
    BCELTestCreator creator = new BCELTestCreator();
    creator.create(new FileOutputStream("BCELTest.class"));
  }
}
