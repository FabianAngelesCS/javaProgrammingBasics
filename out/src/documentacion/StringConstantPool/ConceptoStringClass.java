package documentacion.StringConstantPool;

public class ConceptoStringClass {
    /*
    STRING CLASS

La String Class en Java es una clase final que representa cadenas de texto inmutables.

Características Principales
Inmutabilidad:

Una vez que se crea una instancia de String, no se puede modificar. Cualquier operación que parezca modificar una
cadena en realidad crea una nueva cadena.
Ejemplo:
------------------------------------------------------------------------------------------------------------------------
String str = "Hello";
str = str.concat(" World");
System.out.println(str);  // Imprime "Hello World"
Aquí, str.concat(" World") crea una nueva cadena "Hello World" y asigna esa referencia a str.
------------------------------------------------------------------------------------------------------------------------

Uso común:
Las cadenas son una parte esencial de casi todas las aplicaciones, y Java proporciona un soporte robusto para la
manipulación de cadenas.

Almacenamiento en el String Constant Pool:
Los literales de cadena se almacenan en un pool especial que permite reutilización y optimización de memoria.

Constructores
La clase String proporciona varios constructores para crear cadenas:

Desde un array de caracteres:

Ejemplo:
------------------------------------------------------------------------------------------------------------------------
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String str = new String(chars);
System.out.println(str);  // Imprime "Hello"

Desde un array de bytes:
byte[] bytes = {72, 101, 108, 108, 111};
String str = new String(bytes);
System.out.println(str);  // Imprime "Hello"

Desde otro objeto String:
String original = "Hello";
String copy = new String(original);
System.out.println(copy);  // Imprime "Hello"
------------------------------------------------------------------------------------------------------------------------

Métodos Comunes
La clase String proporciona una amplia gama de métodos para manipular y analizar cadenas:

Concatenación:
Ejemplo:
------------------------------------------------------------------------------------------------------------------------
String str1 = "Hello";
String str2 = "World";
String result = str1.concat(str2);
System.out.println(result);  // Imprime "HelloWorld"

Comparación:
String str1 = "Hello";
String str2 = "Hello";
System.out.println(str1.equals(str2));  // Imprime "true"
System.out.println(str1.equalsIgnoreCase("hello"));  // Imprime "true"

Extracción de subcadenas:
String str = "Hello World";
String sub = str.substring(6);
System.out.println(sub);  // Imprime "World"

Reemplazo:
String str = "Hello World";
String replaced = str.replace('o', 'a');
System.out.println(replaced);  // Imprime "Hella Warld

División:
String str = "one,two,three";
String[] parts = str.split(",");
for (String part : parts) {
    System.out.println(part);
}
// Imprime "one", "two", "three" en líneas separadas

Búsqueda:
String str = "Hello World";
System.out.println(str.indexOf('o'));  // Imprime "4"
System.out.println(str.indexOf("World"));  // Imprime "6"

Transformación a mayúsculas/minúsculas:
String str = "Hello World";
System.out.println(str.toUpperCase());  // Imprime "HELLO WORLD"
System.out.println(str.toLowerCase());  // Imprime "hello world"

Ejemplo Completo
Aquí tienes un ejemplo completo que muestra varias operaciones de la clase String:
public class StringExample {
    public static void main(String[] args) {
        // Crear cadenas
        String str1 = "Hello";
        String str2 = new String("World");
        char[] chars = {'J', 'a', 'v', 'a'};
        String str3 = new String(chars);

        // Concatenar
        String greeting = str1 + " " + str2;
        System.out.println(greeting);  // Imprime "Hello World"

        // Comparar
        System.out.println(str1.equals("Hello"));  // Imprime "true"
        System.out.println(str1.equalsIgnoreCase("hello"));  // Imprime "true"

        // Subcadena
        System.out.println(greeting.substring(6));  // Imprime "World"

        // Reemplazar
        System.out.println(greeting.replace('o', 'a'));  // Imprime "Hella Warld"

        // Dividir
        String[] parts = greeting.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
        // Imprime "Hello" y "World" en líneas separadas

        // Buscar
        System.out.println(greeting.indexOf('o'));  // Imprime "4"

        // Transformar
        System.out.println(greeting.toUpperCase());  // Imprime "HELLO WORLD"
    }
}
Resumen:
La clase String en Java es fundamental para trabajar con cadenas de texto. Su inmutabilidad, junto con una amplia
variedad de métodos, permite manipular y gestionar cadenas de texto de manera eficiente y segura. El String Constant
Pool y la optimización de memoria son aspectos importantes que contribuyen al rendimiento general de las aplicaciones
Java.
     */
}
