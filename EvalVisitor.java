import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends TrigCalculatorBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<>();

    @Override
    public Double visitAssign(TrigCalculatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Double visitPrintExpr(TrigCalculatorParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        System.out.println(round(value, 2)); // Redondear a 2 decimales
        return 0.0;
    }

    @Override
    public Double visitInt(TrigCalculatorParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }

    @Override
    public Double visitId(TrigCalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        return 0.0;
    }

    @Override
    public Double visitMulDiv(TrigCalculatorParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if (ctx.op.getType() == TrigCalculatorParser.MUL) return round(left * right, 2);
        return round(left / right, 2);
    }

    @Override
    public Double visitAddSub(TrigCalculatorParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));
        if (ctx.op.getType() == TrigCalculatorParser.ADD) return round(left + right, 2);
        return round(left - right, 2);
    }

    @Override
    public Double visitParens(TrigCalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitTrigFunc(TrigCalculatorParser.TrigFuncContext ctx) {
        double value = visit(ctx.expr());
        String funcName = ctx.func().getText();
        double result;
        switch (funcName) {
            case "sin":
                result = Math.sin(Math.toRadians(value));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(value));
                break;
            case "tan":
                result = Math.tan(Math.toRadians(value));
                break;
            default:
                throw new RuntimeException("Unknown function: " + funcName);
        }
        return round(result, 2); // Redondear a 2 decimales
    }

    // Método para redondear un valor a un número específico de decimales
    private Double round(double value, int decimalPlaces) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
