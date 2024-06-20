package com.excepciones;

public class ThrowVsThrows {
/*
En Java, throw y throws son dos conceptos relacionados con la gestión de excepciones, pero se utilizan de manera
diferente. Aquí hay una explicación detallada de cada uno y sus diferencias:

throw
Propósito:
La palabra clave throw se utiliza para lanzar una excepción de manera explícita desde un bloque de código.

Uso:
Se utiliza dentro de un método o un bloque de código para lanzar una excepción específica.

Sintaxis:
throw seguido de una instancia de una clase de excepción.
Ejemplo:

------------------------------------------------------------------------------------------------------------------------

public class EjemploThrow {
    public static void validarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18.");
        }
    }

    public static void main(String[] args) {
        validarEdad(15); // Esto lanzará una IllegalArgumentException
    }
}
------------------------------------------------------------------------------------------------------------------------

En este ejemplo, el método validarEdad lanza una IllegalArgumentException si la edad es menor que 18.

throws
Propósito:
La palabra clave throws se utiliza en la declaración de un método para indicar que el método puede lanzar una o más
excepciones. Esto informa a los usuarios del método que deben manejar esas excepciones.

Uso:
Se utiliza en la firma de un método para declarar las excepciones que el método puede lanzar.

Sintaxis:
throws seguido de una o más clases de excepción separadas por comas.
Ejemplo:

------------------------------------------------------------------------------------------------------------------------

import java.io.IOException;

public class EjemploThrows {
    public static void metodoQueLanzaExcepcion() throws IOException {
        // Código que puede lanzar IOException
        throw new IOException("Error de entrada/salida");
    }

    public static void main(String[] args) {
        try {
            metodoQueLanzaExcepcion(); // Este método puede lanzar IOException
        } catch (IOException e) {
            System.out.println("Se capturó una excepción: " + e.getMessage());
        }
    }
}
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, el método metodoQueLanzaExcepcion declara que puede lanzar una IOException utilizando throws en su
firma.

Diferencias Clave

Uso en el Código:
throw: Se utiliza dentro de un método para lanzar una excepción específica en un punto concreto del código.
throws: Se utiliza en la firma de un método para declarar que el método puede lanzar una o más excepciones, informando
a los usuarios del método de posibles excepciones.

Posición:
throw: Se encuentra dentro del cuerpo del método.
throws: Se encuentra en la declaración del método, después de los paréntesis de los parámetros y antes del cuerpo del
método.
Propósito:

throw: Activa una excepción en tiempo de ejecución.
throws: Informa al compilador y a los desarrolladores que un método puede lanzar ciertas excepciones, que deben ser
manejadas por el código que llama al método.

Ejemplo Combinado
Aquí hay un ejemplo que combina ambos conceptos:

------------------------------------------------------------------------------------------------------------------------
import java.io.IOException;

public class EjemploThrowThrows {
    public static void metodoQueLanzaExcepcion() throws IOException {
        // Lanzar una IOException usando throw
        throw new IOException("Error de entrada/salida");
    }

    public static void main(String[] args) {
        try {
            metodoQueLanzaExcepcion(); // Este método puede lanzar IOException
        } catch (IOException e) {
            System.out.println("Se capturó una excepción: " + e.getMessage());
        }
    }
}
En resumen, throw se utiliza para lanzar una excepción en un punto específico del código, mientras que throws se
utiliza para declarar que un método puede lanzar una o más excepciones, que deben ser manejadas por el código que llama
al método.

 */
}
