package com.excepciones;

public class QueEsExcepcion {
/*
Las excepciones en Java son eventos anormales que ocurren durante la ejecución de un programa y que interrumpen el
flujo normal de las instrucciones del programa. Las excepciones son una forma de manejar errores o situaciones
excepcionales de una manera controlada y predecible.

Jerarquía de Excepciones
En Java, las excepciones son objetos que representan eventos excepcionales y pertenecen a la jerarquía de clases que
hereda de Throwable. La jerarquía principal es la siguiente:

Throwable

Error
Exception
RuntimeException

Tipos de Excepciones

Checked Exceptions (Excepciones Verificadas):
Estas son excepciones que son verificadas en tiempo de compilación. El compilador obliga al programador a manejarlas
explícitamente mediante try-catch o declarando el uso de throws en la firma del método.
Ejemplos: IOException, SQLException.

Unchecked Exceptions (Excepciones No Verificadas):
Estas excepciones no son verificadas en tiempo de compilación. Son subclases de RuntimeException. No es obligatorio
manejarlas explícitamente, aunque es una buena práctica hacerlo.
Ejemplos: NullPointerException, ArrayIndexOutOfBoundsException.

Errors (Errores):
Representan problemas graves que generalmente no deberían ser manejados por la aplicación. Estos son problemas
relacionados con el entorno de ejecución, como OutOfMemoryError.
Ejemplos: StackOverflowError, VirtualMachineError.

Manejo de Excepciones
Java proporciona un mecanismo robusto para manejar excepciones utilizando bloques try, catch, finally, y la palabra
clave throw.

Bloques try-catch-finally

try:
El bloque que contiene el código que podría generar una excepción.
catch:
El bloque que maneja la excepción si ocurre.
finally:
El bloque que contiene código que se ejecuta siempre, ya sea que se lance una excepción o no.

------------------------------------------------------------------------------------------------------------------------
public class EjemploExcepcion {
    public static void main(String[] args) {
        try {
            // Código que puede lanzar una excepción
            int resultado = 10 / 0; // Esto lanzará ArithmeticException
        } catch (ArithmeticException e) {
            // Manejo de la excepción
            System.out.println("Ocurrió una excepción: " + e.getMessage());
        } finally {
            // Código que se ejecuta siempre
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
------------------------------------------------------------------------------------------------------------------------
Declaración de Excepciones con throws
Si un método puede lanzar una excepción verificada, debe declararla usando throws en su firma.

------------------------------------------------------------------------------------------------------------------------

public void metodoQueLanzaExcepcion() throws IOException {
    // Código que puede lanzar IOException
    throw new IOException("Error de entrada/salida");
}

------------------------------------------------------------------------------------------------------------------------
Lanzamiento de Excepciones con throw
Para lanzar una excepción de manera explícita, se utiliza la palabra clave throw.

------------------------------------------------------------------------------------------------------------------------
public void validarEdad(int edad) {
    if (edad < 18) {
        throw new IllegalArgumentException("La edad debe ser mayor o igual a 18.");
    }
}
------------------------------------------------------------------------------------------------------------------------
Resumen
Las excepciones en Java son una forma estructurada de manejar errores y condiciones excepcionales. La jerarquía de
excepciones permite diferenciar entre distintos tipos de problemas, y el uso de bloques try-catch-finally junto con
throw y throws proporciona un mecanismo completo para la gestión de errores, permitiendo que los programas respondan
adecuadamente a situaciones anómalas y mantengan un flujo de ejecución estable.

 */
}
