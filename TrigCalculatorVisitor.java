// Generated from TrigCalculator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrigCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrigCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(TrigCalculatorParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(TrigCalculatorParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(TrigCalculatorParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(TrigCalculatorParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TrigCalculatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(TrigCalculatorParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrigCalculatorParser#trigFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigFunc(TrigCalculatorParser.TrigFuncContext ctx);
}