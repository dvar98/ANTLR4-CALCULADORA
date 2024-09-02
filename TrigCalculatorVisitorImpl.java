import java.text.DecimalFormat;

public class TrigCalculatorVisitorImpl extends TrigCalculatorBaseVisitor<Double> {

    private static final DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public Double visitPrintExpr(TrigCalculatorParser.PrintExprContext ctx) {
        Double result = visit(ctx.expresion());
        System.out.println("Resultado: " + result);
        return result;
    }

    @Override
    public Double visitExpresion(TrigCalculatorParser.ExpresionContext ctx) {
        Double result = visit(ctx.termino(0));
        for (int i = 1; i < ctx.termino().size(); i++) {
            if (ctx.ADD(i - 1) != null) {
                result += visit(ctx.termino(i));
            } else {
                result -= visit(ctx.termino(i));
            }
        }
        return result;
    }

    @Override
    public Double visitTermino(TrigCalculatorParser.TerminoContext ctx) {
        Double result = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            if (ctx.MUL(i - 1) != null) {
                result *= visit(ctx.factor(i));
            } else {
                result /= visit(ctx.factor(i));
            }
        }
        return result;
    }

    @Override
    public Double visitFactor(TrigCalculatorParser.FactorContext ctx) {
        Double result = visit(ctx.base());
        if (ctx.SUB() != null) {
            result = -result;
        }
        if (ctx.POW() != null) {
            result = Math.pow(result, visit(ctx.factor()));
        }
        return result;
    }

    @Override
    public Double visitBase(TrigCalculatorParser.BaseContext ctx) {
        if (ctx.NUMERO() != null) {
            return Double.parseDouble(ctx.NUMERO().getText());
        } else if (ctx.trigFunc() != null) {
            return visit(ctx.trigFunc());
        } else {
            return visit(ctx.expresion());
        }
    }

    @Override
    public Double visitTrigFunc(TrigCalculatorParser.TrigFuncContext ctx) {
        Double arg = visit(ctx.expresion());
        Double result = 0.0;
        if (ctx.SIN() != null) {
            result = Math.sin(Math.toRadians(arg));
        } else if (ctx.COS() != null) {
            result = Math.cos(Math.toRadians(arg));
        } else if (ctx.TAN() != null) {
            result = Math.tan(Math.toRadians(arg));
        }
        // Redondea el resultado
        return Double.parseDouble(df.format(result).replace(",", "."));
    }
}
