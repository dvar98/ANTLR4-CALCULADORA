import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Calc {
    public static void main(String[] args) throws Exception {
        // Lee el archivo de entrada
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        CharStream input = CharStreams.fromFileName(inputFile);

        // Crea el lexer, token stream y el parser a partir de la gramática
        TrigCalculatorLexer lexer = new TrigCalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigCalculatorParser parser = new TrigCalculatorParser(tokens);

        // Parsea el archivo y obtiene el árbol de sintaxis
        ParseTree tree = parser.prog();

        // Crea un visitante para evaluar las expresiones
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
