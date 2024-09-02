import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una expresión (o 'salir' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            // Crear el lexer y parser
            CharStream stream = CharStreams.fromString(input);
            TrigCalculatorLexer lexer = new TrigCalculatorLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TrigCalculatorParser parser = new TrigCalculatorParser(tokens);

            // Parsear la entrada
            ParseTree tree = parser.inicio();

            // Crear el visitor y evaluar el árbol
            TrigCalculatorVisitorImpl visitor = new TrigCalculatorVisitorImpl();
            visitor.visit(tree);
        }

        scanner.close();
    }
}