package com.stringBufferYStringBuilder;

public class EjemploStringBuffer {

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
