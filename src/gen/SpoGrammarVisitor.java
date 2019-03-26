// Generated from C:/Users/Maria-Theresa/IdeaProjects/SPO\SpoGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpoGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpoGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpoGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SpoGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SpoGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoGrammarParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(SpoGrammarParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoGrammarParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(SpoGrammarParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoGrammarParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(SpoGrammarParser.TContext ctx);
}