package com.programacionOrientadaObjetos;

public class metodos {

    /*
---¿QÉ SON LOS METODOS EN JAVA?---

En Java, los métodos son bloques de código que se definen dentro de una clase y se utilizan para realizar ciertas
acciones o tareas específicas. Los métodos en Java pueden aceptar datos de entrada (parámetros), realizar operaciones
sobre esos datos y, opcionalmente, devolver un resultado. Son fundamentales para la programación en Java y se utilizan
para organizar y modularizar el código.

Aquí tienes algunos aspectos importantes sobre los métodos en Java:

Declaración:
Los métodos se declaran dentro de una clase y siguen una sintaxis específica que incluye el modificador de acceso, el
tipo de retorno, el nombre del método y los parámetros (si los hay).

Modificadores de acceso:
Los métodos pueden tener modificadores de acceso como public, private, protected o sin modificador (llamado "paquete
 privado"), que controlan su visibilidad y accesibilidad desde otras clases.

Tipo de retorno:
Especifica el tipo de dato que el método devolverá como resultado. Puede ser un tipo primitivo, un tipo de objeto o
void si el método no devuelve ningún valor.

Nombre del método:
Es un identificador único que se utiliza para invocar al método. Debe seguir las reglas de nomenclatura de Java y ser
descriptivo de la acción que realiza el método.

Parámetros:
Son com.variables que se utilizan para pasar datos al método cuando se invoca. Los parámetros se especifican entre
paréntesis y pueden ser de cualquier tipo de dato válido en Java.

Cuerpo del método:
Contiene las instrucciones que definen las acciones que realizará el método cuando se llame. Este bloque de código está
delimitado por llaves {}.

Invocación del método:
Para utilizar un método, se hace una llamada al mismo utilizando su nombre seguido de paréntesis y los argumentos
necesarios, si los hay. Si el método devuelve un valor, este puede ser asignado a una variable o utilizado directamente
en una expresión.

Aquí tienes un ejemplo de declaración y uso de un método en Java:

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
public class EjemploMetodos {

    // Método que suma dos números enteros y devuelve el resultado
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Llamada al método sumar y asignación del resultado a una variable
        int resultado = sumar(5, 3);

        // Impresión del resultado
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, el método sumar acepta dos parámetros de tipo int, realiza la operación de suma y devuelve el
resultado. Luego, en el método main, se llama al método sumar con los valores 5 y 3, y el resultado se imprime en la
consola.
     */
}
