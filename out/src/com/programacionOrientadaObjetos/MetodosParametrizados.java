package com.programacionOrientadaObjetos;

public class MetodosParametrizados {

    /*

En Java, los métodos parametrizados son aquellos que aceptan uno o más parámetros como entrada. Estos parámetros son
com.variables que se utilizan para pasar datos al método cuando se invoca. Los métodos parametrizados permiten hacer
que los métodos sean más flexibles y reutilizables al permitirles operar con diferentes conjuntos de datos.

Aquí tienes un ejemplo de un método parametrizado en Java:

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
public class EjemploMetodoParametrizado {

    // Método parametrizado que suma dos números enteros y devuelve el resultado
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Llamada al método sumar con argumentos 5 y 3
        int resultado1 = sumar(5, 3);
        System.out.println("Resultado 1: " + resultado1); // Imprime "Resultado 1: 8"

        // Llamada al método sumar con argumentos 10 y 7
        int resultado2 = sumar(10, 7);
        System.out.println("Resultado 2: " + resultado2); // Imprime "Resultado 2: 17"
    }
}
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, el método sumar es parametrizado ya que acepta dos parámetros de tipo int, num1 y num2.
Estos parámetros se utilizan dentro del método para realizar la operación de suma. Cuando el método se invoca en el
método main, se pasan diferentes argumentos (5 y 3 en la primera llamada, y 10 y 7 en la segunda llamada) y se
obtienen diferentes resultados. Esto demuestra cómo los métodos parametrizados pueden operar con diferentes conjuntos
de datos según los argumentos que se les pasen al ser invocados.

     */



}
