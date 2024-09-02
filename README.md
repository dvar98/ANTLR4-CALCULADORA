# Calculadora Trigonométrica

Esta es una calculadora simple implementada en Java usando ANTLR v4, que soporta operaciones aritméticas básicas y funciones trigonométricas. La calculadora puede interpretar y evaluar expresiones matemáticas que incluyen suma, resta, multiplicación, división, y funciones trigonométricas (`sin`, `cos`, `tan`).

## Características

- Soporta operaciones aritméticas: suma, resta, multiplicación, división y potencia.
- Soporta funciones trigonométricas: seno (`sin`), coseno (`cos`) y tangente (`tan`).
- Permite el uso de números negativos y paréntesis para agrupar operaciones.

## Estructura del Proyecto

- `TrigCalculator.g4`: Archivo de gramática ANTLR4.
- `TrigCalculatorLexer.java`: Generado automáticamente por ANTLR4; contiene el lexer.
- `TrigCalculatorParser.java`: Generado automáticamente por ANTLR4; contiene el parser.
- `TrigCalculatorVisitorImpl.java`: Implementación del visitante para evaluar las expresiones.
- `Calc.java`: Programa principal que lee expresiones desde la entrada estándar y evalúa usando `TrigCalculatorVisitorImpl.java`.

## Requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) 8 o superior
- [ANTLR 4](https://www.antlr.org/download.html) (Java runtime environment)

## Instalación

1. **Descargar e instalar ANTLR:**

   Sigue las instrucciones en la [página oficial de ANTLR](https://www.antlr.org/download.html) para descargar e instalar ANTLR 4.

2. **Configurar ANTLR:**

   Asegúrate de que el archivo JAR de ANTLR esté en tu `CLASSPATH`. Puedes hacer esto añadiendo lo siguiente a tu archivo `.bashrc` o `.zshrc` (ajusta la ruta a donde hayas descargado ANTLR):

   ```bash
   export CLASSPATH=".:/path/to/antlr-4.x-complete.jar"
   alias antlr4='java -jar /path/to/antlr-4.x-complete.jar'
   alias grun='java org.antlr.v4.runtime.misc.TestRig'
    ```
3. **Compilar la gramática:**

    Con el archivo **TrigCalculator.g4** en tu directorio de trabajo, ejecuta:
   ```bash
    antlr4 -no-listener -visitor TrigCalculator.g4
    ```
4. **Compilar el código Java:**

    Asegúrate de que todos los archivos `.java` generados por ANTLR estén en el directorio actual. Luego compila el código Java:
   ```bash
    javac Calc.java TrigCalculator*.java
    ```
## USO
1. **Crear un archivo de entrada:**

    Crea un archivo de texto llamado t.expr (o cualquier otro nombre que prefieras) con las expresiones que deseas evaluar. Por ejemplo:
   ```bash
    sin(45)
    cos(60)
    tan(45)
    a = 5
    b = 6
    a + b * 2
   ```
2. **Ejecutar la calculadora:**


    Ejecuta el programa con el archivo de entrada:

   ```bash
   java Calc
   ```
2. **Ingresar Expresiones**:
   - Puede ingresar expresiones como `(-6 + 2)`, `5 - (-3)`, `sin(30)`, etc.
   - Escriba `salir` para terminar el programa.

## Ejemplo de Salida 

Para el archivo t.expr con el contenido:
    
    tan(45)

La salida será:
```
1.0
```

- **Archivo TrigCalculator.g4**

    El archivo de gramática TrigCalculator.g4 define la sintaxis de la calculadora. Asegúrate de que esté en el directorio de trabajo y contenga la siguiente gramática:

    ```
    grammar TrigCalculator;

    // Reglas léxicas (tokens)
    NUMERO: [0-9]+ ('.' [0-9]+)?;  // Soporte para números enteros y decimales
    ADD: '+';
    SUB: '-';
    MUL: '*';
    DIV: '/';
    POW: '^';
    EQUAL: '=';
    LPAREN: '(';
    RPAREN: ')';
    SIN: 'sin';
    COS: 'cos';
    TAN: 'tan';

    // Manejo de espacios en blanco (opcional)
    WS: [ \t\r\n]+ -> skip;  // Ignorar espacios en blanco

    // Reglas sintácticas
    inicio: (printExpr)* EOF;

    printExpr: expresion;

    expresion: termino ((ADD | SUB) termino)*;

    termino: factor ((MUL | DIV) factor)*;

    factor: (SUB)? base (POW factor)?;

    base: NUMERO | LPAREN expresion RPAREN | trigFunc;

    trigFunc: (SIN | COS | TAN) LPAREN expresion RPAREN;

    ```
## Equipo

- **Daniel Santiago Varela Guerrero**
- **Miguel Angel Velasco**
- **Sebastian Sabogal Castillo**