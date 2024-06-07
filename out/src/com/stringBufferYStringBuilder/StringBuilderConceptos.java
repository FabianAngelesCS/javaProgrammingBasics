package com.stringBufferYStringBuilder;

public class StringBuilderConceptos {
    /*
Características principales de StringBuilder
Mutabilidad:

Al igual que StringBuffer, los objetos de StringBuilder pueden ser modificados después de su creación, lo que permite
realizar operaciones como agregar, eliminar o modificar caracteres de manera más eficiente.
No seguro para hilos (Not Thread-Safe):

StringBuilder no es sincrónico, lo que significa que sus métodos no están sincronizados. Esto lo hace más rápido que
StringBuffer en entornos de un solo hilo, ya que no tiene la sobrecarga de garantizar la seguridad en contextos de
múltiples hilos.
Capacidad dinámica:

StringBuilder ajusta su capacidad automáticamente según sea necesario para acomodar secuencias de caracteres
adicionales, lo que mejora su eficiencia en comparación con la creación de nuevos objetos String repetidamente.
Métodos comunes de StringBuilder
append(): Añade la representación de cadena de un argumento al contenido de la secuencia.
insert(): Inserta una secuencia de caracteres en una posición especificada.
delete(): Elimina un intervalo de caracteres.
reverse(): Invierte la secuencia de caracteres.
toString(): Convierte el contenido de StringBuilder en un objeto String.

Ejemplo de uso de StringBuilder
Aquí hay un ejemplo que demuestra algunas de las operaciones comunes que se pueden realizar con StringBuilder:
------------------------------------------------------------------------------------------------------------------------
public class StringBuilderExample {
    public static void main(String[] args) {
        // Crear un StringBuilder con una cadena inicial
        StringBuilder sb = new StringBuilder("Hola");

        // Append: añadir más texto al StringBuilder
        sb.append(", bienvenido a la programación en Java!");
        System.out.println("Después de append: " + sb);

        // Insert: insertar texto en una posición específica
        sb.insert(5, " mundo");
        System.out.println("Después de insert: " + sb);

        // Delete: eliminar un rango de caracteres
        sb.delete(5, 11);
        System.out.println("Después de delete: " + sb);

        // Reverse: invertir la secuencia de caracteres
        sb.reverse();
        System.out.println("Después de reverse: " + sb);

        // Convertir StringBuilder a String
        String result = sb.toString();
        System.out.println("String final: " + result);
    }
}
------------------------------------------------------------------------------------------------------------------------
Diferencias entre String, StringBuffer y StringBuilder
String: Inmutable, seguro para hilos debido a la inmutabilidad, adecuado para cadenas de texto que no cambian.
StringBuffer: Mutable, seguro para hilos, adecuado para situaciones donde se necesita modificar la cadena en entornos
con múltiples hilos.
StringBuilder: Mutable, no seguro para hilos, más rápido que StringBuffer y adecuado para modificaciones en un solo
hilo.
Cuando usar StringBuilder
Usa StringBuilder cuando necesites realizar muchas modificaciones a una cadena de caracteres en un entorno de un solo
hilo para obtener el mejor rendimiento.
Si necesitas seguridad en entornos con múltiples hilos, entonces StringBuffer sería la elección adecuada.
*/
}
