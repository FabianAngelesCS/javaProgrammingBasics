package com.stringBufferYStringBuilder;

public class StringBufferConceptos {
    /*
La clase StringBuffer en Java es una clase que proporciona una manera flexible y eficiente de manipular secuencias
de caracteres. A diferencia de la clase String, las instancias de StringBuffer son mutables, lo que significa que se
pueden modificar después de su creación. Esto hace que StringBuffer sea más adecuado para situaciones en las que se
necesitan realizar muchas modificaciones en una cadena, ya que evita la sobrecarga de crear nuevos objetos String
repetidamente.

Características principales de StringBuffer

Mutabilidad:
Los objetos de StringBuffer pueden ser modificados después de su creación, lo que permite realizar operaciones como
agregar, eliminar o modificar caracteres de manera más eficiente.

Seguridad de hilos (Thread-Safety):
StringBuffer es sincrónico, lo que significa que sus métodos están sincronizados para garantizar la seguridad en
entornos con múltiples hilos (threads). Esto hace que StringBuffer sea seguro para el uso concurrente, pero también
más lento que StringBuilder en entornos de un solo hilo.

Capacidad dinámica:
StringBuffer ajusta su capacidad automáticamente según sea necesario para acomodar secuencias de caracteres
adicionales, lo que mejora su eficiencia en comparación con la creación de nuevos objetos String repetidamente.

Métodos comunes de StringBuffer:
append(): Añade la representación de cadena de un argumento al contenido de la secuencia.
insert(): Inserta una secuencia de caracteres en una posición especificada.
delete(): Elimina un intervalo de caracteres.
reverse(): Invierte la secuencia de caracteres.
toString(): Convierte el contenido de StringBuffer en un objeto String.

Ejemplo de uso de StringBuffer
Aquí hay un ejemplo que demuestra algunas de las operaciones comunes que se pueden realizar con StringBuffer:
------------------------------------------------------------------------------------------------------------------------
public class StringBufferExample {
    public static void main(String[] args) {
        // Crear un StringBuffer con una cadena inicial
        StringBuffer sb = new StringBuffer("Hola");

        // Append: añadir más texto al StringBuffer
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

        // Convertir StringBuffer a String
        String result = sb.toString();
        System.out.println("String final: " + result);
    }
}
------------------------------------------------------------------------------------------------------------------------
     */
}
