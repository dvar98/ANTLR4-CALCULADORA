// Generated from TrigCalculator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigCalculatorParser}.
 */
public interface TrigCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(TrigCalculatorParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(TrigCalculatorParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TrigCalculatorParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TrigCalculatorParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(TrigCalculatorParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(TrigCalculatorParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TrigCalculatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TrigCalculatorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(TrigCalculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(TrigCalculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(TrigCalculatorParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(TrigCalculatorParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalculatorParser#trigFunc}.
	 * @param ctx the parse tree
	 */
	void enterTrigFunc(TrigCalculatorParser.TrigFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalculatorParser#trigFunc}.
	 * @param ctx the parse tree
	 */
	void exitTrigFunc(TrigCalculatorParser.TrigFuncContext ctx);
}