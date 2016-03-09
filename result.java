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
    MethodGen method = new MethodGen(ACC_PUBLIC | ACC_STATIC, Type.INT, new Type[] { Type.INT }, new String[] { "arg0" }, "greet", "BCELTest", il, _cp);

    InstructionHandle ih_0 = il.append(new PUSH(_cp, 1));
    il.append(_factory.createStore(Type.INT, 1));
    InstructionHandle ih_2 = il.append(_factory.createLoad(Type.INT, 0));
    il.append(new PUSH(_cp, 3));
    il.append(InstructionConstants.IMUL);
    InstructionHandle ih_5 = il.append(_factory.createReturn(Type.INT));
    method.setMaxStack();
    method.setMaxLocals();
    _cg.addMethod(method.getMethod());
    il.dispose();
  }

  private void createMethod_2() {
    InstructionList il = new InstructionList();
    MethodGen method = new MethodGen(ACC_PUBLIC | ACC_STATIC, Type.VOID, new Type[] { new ArrayType(Type.STRING, 1) }, new String[] { "arg0" }, "main", "BCELTest", il, _cp);

    InstructionHandle ih_0 = il.append(new PUSH(_cp, 2));
    il.append(_factory.createInvoke("BCELTest", "greet", Type.INT, new Type[] { Type.INT }, Constants.INVOKESTATIC));
    il.append(_factory.createStore(Type.INT, 1));
    InstructionHandle ih_5 = il.append(new PUSH(_cp, 4));
    il.append(_factory.createStore(Type.INT, 3));
    InstructionHandle ih_7 = il.append(new PUSH(_cp, 8));
    il.append(_factory.createStore(Type.INT, 4));
    InstructionHandle ih_11 = il.append(new PUSH(_cp, 10));
    il.append(_factory.createStore(Type.INT, 5));
    InstructionHandle ih_15 = il.append(new PUSH(_cp, 1.5));
    il.append(_factory.createStore(Type.DOUBLE, 6));
    InstructionHandle ih_20 = il.append(new PUSH(_cp, "Haha"));
    il.append(_factory.createStore(Type.OBJECT, 8));
    InstructionHandle ih_24 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, 6.0));
    il.append(_factory.createLoad(Type.INT, 1));
    il.append(InstructionConstants.I2D);
    il.append(new PUSH(_cp, 33.4));
    il.append(InstructionConstants.DMUL);
    il.append(InstructionConstants.DADD);
    il.append(new PUSH(_cp, 12.0));
    il.append(InstructionConstants.DADD);
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.DOUBLE }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_44 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, "Hello, world!"));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_52 = il.append(_factory.createLoad(Type.INT, 3));
    il.append(new PUSH(_cp, 20));
        BranchInstruction if_icmpgt_55 = _factory.createBranchInstruction(Constants.IF_ICMPGT, null);
    il.append(if_icmpgt_55);
    il.append(_factory.createLoad(Type.INT, 3));
    il.append(new PUSH(_cp, 100));
        BranchInstruction if_icmpge_61 = _factory.createBranchInstruction(Constants.IF_ICMPGE, null);
    il.append(if_icmpge_61);
    InstructionHandle ih_64 = il.append(_factory.createLoad(Type.INT, 3));
    il.append(new PUSH(_cp, 1));
    il.append(InstructionConstants.IADD);
    il.append(_factory.createStore(Type.INT, 3));
        BranchInstruction goto_68 = _factory.createBranchInstruction(Constants.GOTO, ih_52);
    il.append(goto_68);
    InstructionHandle ih_71 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, "Hello, world!"));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_79 = il.append(_factory.createFieldAccess("java.lang.System", "out", new ObjectType("java.io.PrintStream"), Constants.GETSTATIC));
    il.append(new PUSH(_cp, 12));
    il.append(_factory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[] { Type.INT }, Constants.INVOKEVIRTUAL));
    InstructionHandle ih_87 = il.append(_factory.createReturn(Type.VOID));
    if_icmpgt_55.setTarget(ih_64);
    if_icmpge_61.setTarget(ih_71);
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
