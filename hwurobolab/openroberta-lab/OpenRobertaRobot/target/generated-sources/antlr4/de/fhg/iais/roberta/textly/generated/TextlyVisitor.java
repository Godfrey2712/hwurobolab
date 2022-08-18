// Generated from de/fhg/iais/roberta/textly/generated/Textly.g4 by ANTLR 4.7.2
package de.fhg.iais.roberta.textly.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TextlyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TextlyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code VarName}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(TextlyParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(TextlyParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(TextlyParser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(TextlyParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link TextlyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(TextlyParser.ParenthesesContext ctx);
}