// Generated from de/fhg/iais/roberta/textly/generated/Textly.g4 by ANTLR 4.7.2
package de.fhg.iais.roberta.textly.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TextlyParser}.
 */
public interface TextlyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code VarName}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarName(TextlyParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarName}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarName(TextlyParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(TextlyParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(TextlyParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(TextlyParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(TextlyParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(TextlyParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(TextlyParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(TextlyParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(TextlyParser.ParenthesesContext ctx);
}