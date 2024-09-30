package documentacion.condicionalesIfElse;

public class ConceptoIfElse {
    /*
---Condicionales IF, ELSE IF, ELSE----

En Java, los condicionales if, else if y else se utilizan para tomar decisiones en función del resultado de una
condición. Estos condicionales te permiten controlar el flujo de ejecución del programa y ejecutar diferentes bloques
de código según se cumplan ciertas condiciones.

Aquí tienes una descripción de cómo funcionan cada uno de estos condicionales:

if:
El condicional if se utiliza para ejecutar un bloque de código si una condición es verdadera. Si la condición evaluada
dentro del if es true, el bloque de código dentro del if se ejecutará. Si la condición es false, el bloque de código
dentro del if se omitirá y la ejecución continuará con la siguiente instrucción después del if.

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
int x = 10;
if (x > 5) {
    System.out.println("x es mayor que 5");
}
------------------------------------------------------------------------------------------------------------------------
else if:
El condicional else if se utiliza después de un if para evaluar múltiples condiciones en secuencia. Si la condición en
el if es false, se evaluará la siguiente condición en el else if. Si la condición en un else if es true, se ejecutará
el bloque de código asociado y se omitirán todas las condiciones restantes. Si todas las condiciones anteriores son
false, se puede ejecutar un bloque de código opcional en un else.

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
int x = 10;
if (x > 10) {
    System.out.println("x es mayor que 10");
} else if (x < 10) {
    System.out.println("x es menor que 10");
} else {
    System.out.println("x es igual a 10");
}
------------------------------------------------------------------------------------------------------------------------
else: El condicional else se utiliza opcionalmente después de un if o un else if para ejecutar un bloque de código si
ninguna de las condiciones anteriores es verdadera. Solo se puede tener un else asociado a un if o a una serie de else
if. No se pueden tener múltiples bloques else para un solo if.

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
int x = 10;
if (x > 5) {
    System.out.println("x es mayor que 5");
} else {
    System.out.println("x es menor o igual a 5");
}
------------------------------------------------------------------------------------------------------------------------
En resumen, los condicionales if, else if y else en Java se utilizan para tomar decisiones basadas en el valor de una
condición y permiten controlar el flujo de ejecución del programa de manera flexible.

     */
}
