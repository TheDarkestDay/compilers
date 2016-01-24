// Generated from simple.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(simpleParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#constantBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantBlock(simpleParser.ConstantBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#constDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDefinition(simpleParser.ConstDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(simpleParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(simpleParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(simpleParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(simpleParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#variableBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBlock(simpleParser.VariableBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(simpleParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#atomicDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicDefinition(simpleParser.AtomicDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(simpleParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#arrayDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinition(simpleParser.ArrayDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#dictDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictDefinition(simpleParser.DictDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(simpleParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(simpleParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(simpleParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(simpleParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(simpleParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#statementSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(simpleParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(simpleParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(simpleParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(simpleParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(simpleParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(simpleParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(simpleParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(simpleParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(simpleParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsList(simpleParser.ArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(simpleParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(simpleParser.ArgumentContext ctx);
}