package tarea18StringBuilderyStringBuffer;
/*
Crear un programa que pida al usuario una cadena de texto y la convierta a mayúsculas utilizando un objeto de tipo
StringBuffer.
 */
public class Ejercicio4 {
    //Método para convertir letras a mayusculas de una cadena de texto
    public static void conversorMayusculas(StringBuffer sb){
        for (int i = 0; i < sb.length(); i++){
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        //Definición de variable StringBuffer
        StringBuffer sb = new StringBuffer("hola mundo, ahora estoy usando un StringBuffer para convertir conertit a " +
                "mayusculas");
        //Llamado del método para convertir a mayusculas.
        conversorMayusculas(sb);
    }
}
