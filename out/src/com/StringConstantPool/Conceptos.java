package com.StringConstantPool;

public class Conceptos {
    /*
    Concepto del String Constant Pool
Definición:

El String Constant Pool es una área especial en el heap de Java que almacena cadenas de texto. Se utiliza para
optimizar la memoria y mejorar el rendimiento cuando se manejan cadenas de texto en Java.
Uso:

Cada vez que se crea una cadena de texto literal, Java comprueba si esa cadena ya existe en el pool.
Si la cadena ya existe, Java reutiliza la referencia a esa cadena en lugar de crear una nueva.
Si la cadena no existe, Java agrega la nueva cadena al pool.
Ejemplo:
------------------------------------------------------------------------------------------------------------------------
Copiar código
String str1 = "Hello";
String str2 = "Hello";

System.out.println(str1 == str2);  // Imprime "true"
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, str1 y str2 apuntan al mismo objeto en el pool de constantes de cadenas, por lo tanto
str1 == str2 devuelve true.

Beneficios del String Constant Pool
Ahorro de memoria:

Reutilizar cadenas de texto literales reduce el número de objetos de cadena en memoria, ahorrando espacio.
Mejora de rendimiento:

La comparación de referencias es más rápida que la comparación de contenidos, y el pool permite que muchas
comparaciones de cadenas se reduzcan a simples comparaciones de referencias.
Creación de cadenas fuera del String Constant Pool
Uso de new:

Si creas una cadena usando new, se crea una nueva instancia en el heap fuera del pool.

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
Copiar código
String str1 = "Hello";
String str2 = new String("Hello");

System.out.println(str1 == str2);  // Imprime "false"
------------------------------------------------------------------------------------------------------------------------

Aquí, str1 apunta a una cadena en el pool, mientras que str2 apunta a un nuevo objeto de cadena en el heap, por
lo que str1 == str2 devuelve false.

Método intern():

El método intern() de la clase String se puede usar para agregar explícitamente una cadena al pool.

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
Copiar código
String str1 = new String("Hello").intern();
String str2 = "Hello";

System.out.println(str1 == str2);  // Imprime "true"
------------------------------------------------------------------------------------------------------------------------

En este caso, str1.intern() agrega la cadena al pool (si no estaba ya) y devuelve la referencia del pool, haciendo
que str1 == str2 devuelva true.

Detalles Técnicos
Almacenamiento:

Antes de Java 7, el String Constant Pool estaba en el PermGen. A partir de Java 7, se movió al heap principal,
eliminando algunas restricciones y mejorando la gestión de memoria.
Cadenas literales:

Cualquier cadena literal en el código fuente se coloca automáticamente en el pool durante la compilación.
Ejemplo Completo:
------------------------------------------------------------------------------------------------------------------------
public class StringPoolExample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = str3.intern();

        System.out.println(str1 == str2);  // true - both point to the same object in the pool
        System.out.println(str1 == str3);  // false - str3 is a new object in the heap
        System.out.println(str1 == str4);  // true - str4 is interned, pointing to the pool
    }
}
------------------------------------------------------------------------------------------------------------------------
Resumen
El String Constant Pool es una técnica de optimización en Java que permite reutilizar cadenas literales, ahorrando
memoria y mejorando el rendimiento. Comprender cómo funciona y cómo interactuar con él puede ser crucial para
escribir código eficiente y efectivo en Java.

     */
}
