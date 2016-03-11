// Generated from simple.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(simpleParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(simpleParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#constantBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstantBlock(simpleParser.ConstantBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#constantBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstantBlock(simpleParser.ConstantBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(simpleParser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(simpleParser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(simpleParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(simpleParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(simpleParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(simpleParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(simpleParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(simpleParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(simpleParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(simpleParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#variableBlock}.
	 * @param ctx the parse tree
	 */
	void enterVariableBlock(simpleParser.VariableBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#variableBlock}.
	 * @param ctx the parse tree
	 */
	void exitVariableBlock(simpleParser.VariableBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(simpleParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(simpleParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#atomicDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAtomicDefinition(simpleParser.AtomicDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#atomicDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAtomicDefinition(simpleParser.AtomicDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(simpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(simpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinition(simpleParser.ArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinition(simpleParser.ArrayDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#dictDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDictDefinition(simpleParser.DictDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#dictDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDictDefinition(simpleParser.DictDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(simpleParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(simpleParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(simpleParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(simpleParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(simpleParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(simpleParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(simpleParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(simpleParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(simpleParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(simpleParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(simpleParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(simpleParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(simpleParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(simpleParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(simpleParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(simpleParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(simpleParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(simpleParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(simpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(simpleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#subCode}.
	 * @param ctx the parse tree
	 */
	void enterSubCode(simpleParser.SubCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#subCode}.
	 * @param ctx the parse tree
	 */
	void exitSubCode(simpleParser.SubCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(simpleParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(simpleParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(simpleParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(simpleParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#expressionBlock}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBlock(simpleParser.ExpressionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#expressionBlock}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBlock(simpleParser.ExpressionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(simpleParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(simpleParser.LogopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(simpleParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(simpleParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(simpleParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(simpleParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#lowop}.
	 * @param ctx the parse tree
	 */
	void enterLowop(simpleParser.LowopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#lowop}.
	 * @param ctx the parse tree
	 */
	void exitLowop(simpleParser.LowopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(simpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(simpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#highop}.
	 * @param ctx the parse tree
	 */
	void enterHighop(simpleParser.HighopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#highop}.
	 * @param ctx the parse tree
	 */
	void exitHighop(simpleParser.HighopContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(simpleParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(simpleParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(simpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(simpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterArgsList(simpleParser.ArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitArgsList(simpleParser.ArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(simpleParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(simpleParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(simpleParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(simpleParser.ArgumentContext ctx);
}