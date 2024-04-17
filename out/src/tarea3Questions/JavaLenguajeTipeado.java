package tarea3Questions;

public class JavaLenguajeTipeado {

    /*

  -----¿POR QUE JAVA ES UN LENGUAJE TIPEADO?----

Java es un lenguaje de programación tipeado o "typed language" porque requiere que todas las com.variables y expresione
tengan un tipo de dato específico asociado a ellas. Esto significa que en Java, cada variable debe ser declarada con
un tipo de dato explícito que determine qué tipo de valores puede contener y qué operaciones se pueden realizar con
ellos.

Hay varias razones por las cuales Java es un lenguaje tipeado:

Seguridad y robustez:
Al ser un lenguaje tipeado, Java verifica los tipos de datos en tiempo de compilación, lo que ayuda a detectar errores
 de programación relacionados con el uso incorrecto de tipos. Esto contribuye a la robustez y seguridad del código, ya
 que evita errores comunes como sumar un número entero con una cadena de texto.

Claridad y legibilidad del código:
Al especificar explícitamente los tipos de datos de las com.variables, el código se vuelve más claro y legible. Esto
facilita la comprensión del código tanto para los desarrolladores que lo escriben como para los que lo mantienen
en el futuro.

Optimización de rendimiento:
El compilador de Java puede realizar optimizaciones específicas basadas en los tipos de datos utilizados en el código.
Por ejemplo, puede utilizar operaciones de bajo nivel optimizadas para tipos primitivos como enteros y punto flotante.

Interoperabilidad y reutilización de código:
Los tipos de datos en Java son parte del sistema de tipos del lenguaje, lo que facilita la interoperabilidad entre
diferentes componentes de un sistema y la reutilización de código en diferentes partes de una aplicación o en
diferentes aplicaciones.

En resumen, Java es un lenguaje tipeado porque el uso de tipos de datos explícitos contribuye a la seguridad, la
claridad del código, la optimización del rendimiento y la interoperabilidad, lo que hace que sea más fácil desarrollar
y mantener software de calidad en entornos de desarrollo a gran escala.


¿QUÈ ES UN STRING? ¿UN OBJETO, O UN TIPO DE DATO PRIMITIVO?


En Java, String es una clase que representa una secuencia de caracteres. A diferencia de los tipos de datos primitivos
como int, double, etc., que son valores simples y básicos almacenados directamente en la memoria, un String es un
objeto. Específicamente, es un objeto de la clase String proporcionada por la biblioteca estándar de Java.

Aunque String no es un tipo de dato primitivo, es uno de los tipos de datos más utilizados en Java y tiene un soporte
especial en el lenguaje. Java ofrece muchas funciones y métodos para manipular y trabajar con cadenas de texto, lo que
hace que sea fácil realizar operaciones como concatenación, búsqueda, reemplazo, comparación, etc.

Cuando declaras una variable de tipo String, estás creando una referencia a un objeto String en el montón (heap) de la
 memoria. Por ejemplo:

java
Copy code
String mensaje = "Hola, mundo!";
En este caso, mensaje es una variable que hace referencia a un objeto String que contiene la cadena "Hola, mundo!".
Aunque no necesitas usar la palabra clave new para crear un objeto String como lo harías con otros objetos, detrás de
escena, Java crea un objeto String en el montón para almacenar la cadena y asigna la referencia a la variable mensaje.

En resumen, String es una clase en Java que representa cadenas de texto y es tratada como un objeto en lugar de un tipo
 de dato primitivo.
     */
}
