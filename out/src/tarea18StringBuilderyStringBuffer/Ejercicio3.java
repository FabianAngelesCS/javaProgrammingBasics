package tarea18StringBuilderyStringBuffer;
/*
Crea un programa que cuente cuántas veces aparece un carácter específico en una cadena de texto utilizando
StringBuilder.
 */
public class Ejercicio3 {
    //Creación de método para contar caracteres especificos.
    public static void contarCaracter(StringBuilder texto, char caracter){

        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == caracter){
                contador++;
            }
        }
        System.out.println(contador);
    }

    public static void main(String[] args) {
        //Definir variable que contendra la cadena de texto.
        StringBuilder texto = new StringBuilder("Hola, yo no sav¡bia como contar caracteres de un Strinbuilder");
        contarCaracter(texto, 'o');

    }
}
