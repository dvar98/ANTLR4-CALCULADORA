# Calculadora Trigonométrica

Esta es una calculadora simple implementada en Java usando ANTLR v4, que soporta operaciones aritméticas básicas y funciones trigonométricas. La calculadora puede interpretar y evaluar expresiones matemáticas que incluyen suma, resta, multiplicación, división, y funciones trigonométricas (`sin`, `cos`, `tan`).

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
   java Calc t.expr
   ```
    La salida mostrará los resultados evaluados de las expresiones en el archivo de entrada.

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
    antlr

        grammar TrigCalculator;

        stat: expr NEWLINE             # printExpr
            | ID '=' expr NEWLINE      # assign
            | NEWLINE                  # blank
            ;

        expr: expr op=('*'|'/') expr  # MulDiv
            | expr op=('+'|'-') expr  # AddSub
            | INT                     # int
            | ID                      # id
            | '(' expr ')'            # parens
            | func '(' expr ')'       # trigFunc
            ;

        func: 'sin' | 'cos' | 'tan'    # trigFunc

        MUL : '*' ;
        DIV : '/' ;
        ADD : '+' ;
        SUB : '-' ;
        INT : [0-9]+ ;
        ID  : [a-zA-Z]+ ;
        NEWLINE : '\r'? '\n' ;
        WS  : [ \t]+ -> skip ;
    ```