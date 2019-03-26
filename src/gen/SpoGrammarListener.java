// Generated from C:/Users/Maria-Theresa/IdeaProjects/SPO\SpoGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpoGrammarParser}.
 */
public interface SpoGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpoGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SpoGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpoGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SpoGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpoGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SpoGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpoGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SpoGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpoGrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(SpoGrammarParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpoGrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(SpoGrammarParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpoGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(SpoGrammarParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpoGrammarParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(SpoGrammarParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpoGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(SpoGrammarParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpoGrammarParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(SpoGrammarParser.TContext ctx);
}