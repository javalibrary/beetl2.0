// Generated from E:\lijz\javamonkey\bee\research\antlrworks2\projects\beetl\BeetlParser.g4 by ANTLR 4.1
package org.beetl.core.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BeetlParser}.
 */
public interface BeetlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BeetlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BeetlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BeetlParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#g_caseStatment}.
	 * @param ctx the parse tree
	 */
	void enterG_caseStatment(@NotNull BeetlParser.G_caseStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#g_caseStatment}.
	 * @param ctx the parse tree
	 */
	void exitG_caseStatment(@NotNull BeetlParser.G_caseStatmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull BeetlParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull BeetlParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#varDeclareList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclareList(@NotNull BeetlParser.VarDeclareListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#varDeclareList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclareList(@NotNull BeetlParser.VarDeclareListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull BeetlParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull BeetlParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull BeetlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull BeetlParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(@NotNull BeetlParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(@NotNull BeetlParser.VarRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#g_switchStatment}.
	 * @param ctx the parse tree
	 */
	void enterG_switchStatment(@NotNull BeetlParser.G_switchStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#g_switchStatment}.
	 * @param ctx the parse tree
	 */
	void exitG_switchStatment(@NotNull BeetlParser.G_switchStatmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#directiveExp}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveExp(@NotNull BeetlParser.DirectiveExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#directiveExp}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveExp(@NotNull BeetlParser.DirectiveExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull BeetlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull BeetlParser.IntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#textStatment}.
	 * @param ctx the parse tree
	 */
	void enterTextStatment(@NotNull BeetlParser.TextStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#textStatment}.
	 * @param ctx the parse tree
	 */
	void exitTextStatment(@NotNull BeetlParser.TextStatmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull BeetlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull BeetlParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull BeetlParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull BeetlParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#textformat}.
	 * @param ctx the parse tree
	 */
	void enterTextformat(@NotNull BeetlParser.TextformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#textformat}.
	 * @param ctx the parse tree
	 */
	void exitTextformat(@NotNull BeetlParser.TextformatContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(@NotNull BeetlParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(@NotNull BeetlParser.JsonContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#constantsTextStatment}.
	 * @param ctx the parse tree
	 */
	void enterConstantsTextStatment(@NotNull BeetlParser.ConstantsTextStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#constantsTextStatment}.
	 * @param ctx the parse tree
	 */
	void exitConstantsTextStatment(@NotNull BeetlParser.ConstantsTextStatmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#nativeVarRefChain}.
	 * @param ctx the parse tree
	 */
	void enterNativeVarRefChain(@NotNull BeetlParser.NativeVarRefChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#nativeVarRefChain}.
	 * @param ctx the parse tree
	 */
	void exitNativeVarRefChain(@NotNull BeetlParser.NativeVarRefChainContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#jsonKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonKeyValue(@NotNull BeetlParser.JsonKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#jsonKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonKeyValue(@NotNull BeetlParser.JsonKeyValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull BeetlParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull BeetlParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#textVar}.
	 * @param ctx the parse tree
	 */
	void enterTextVar(@NotNull BeetlParser.TextVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#textVar}.
	 * @param ctx the parse tree
	 */
	void exitTextVar(@NotNull BeetlParser.TextVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull BeetlParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull BeetlParser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#functionTagCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTagCall(@NotNull BeetlParser.FunctionTagCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#functionTagCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTagCall(@NotNull BeetlParser.FunctionTagCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#varAttribute}.
	 * @param ctx the parse tree
	 */
	void enterVarAttribute(@NotNull BeetlParser.VarAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#varAttribute}.
	 * @param ctx the parse tree
	 */
	void exitVarAttribute(@NotNull BeetlParser.VarAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull BeetlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull BeetlParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#nativeMethod}.
	 * @param ctx the parse tree
	 */
	void enterNativeMethod(@NotNull BeetlParser.NativeMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#nativeMethod}.
	 * @param ctx the parse tree
	 */
	void exitNativeMethod(@NotNull BeetlParser.NativeMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#assignMent}.
	 * @param ctx the parse tree
	 */
	void enterAssignMent(@NotNull BeetlParser.AssignMentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#assignMent}.
	 * @param ctx the parse tree
	 */
	void exitAssignMent(@NotNull BeetlParser.AssignMentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull BeetlParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull BeetlParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull BeetlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull BeetlParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull BeetlParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull BeetlParser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#g_defaultStatment}.
	 * @param ctx the parse tree
	 */
	void enterG_defaultStatment(@NotNull BeetlParser.G_defaultStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#g_defaultStatment}.
	 * @param ctx the parse tree
	 */
	void exitG_defaultStatment(@NotNull BeetlParser.G_defaultStatmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#nativeCall}.
	 * @param ctx the parse tree
	 */
	void enterNativeCall(@NotNull BeetlParser.NativeCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#nativeCall}.
	 * @param ctx the parse tree
	 */
	void exitNativeCall(@NotNull BeetlParser.NativeCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull BeetlParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull BeetlParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#functionNs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNs(@NotNull BeetlParser.FunctionNsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#functionNs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNs(@NotNull BeetlParser.FunctionNsContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull BeetlParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull BeetlParser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull BeetlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull BeetlParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#nativeArray}.
	 * @param ctx the parse tree
	 */
	void enterNativeArray(@NotNull BeetlParser.NativeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#nativeArray}.
	 * @param ctx the parse tree
	 */
	void exitNativeArray(@NotNull BeetlParser.NativeArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link BeetlParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull BeetlParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetlParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull BeetlParser.SwitchBlockStatementGroupContext ctx);
}