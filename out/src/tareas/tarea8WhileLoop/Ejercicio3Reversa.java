package tareas.tarea8WhileLoop;

import java.util.Scanner;

public class Ejercicio3Reversa {

    static void leerReversa(){
        System.out.println("Ingresa una palabra y yo la devolvere escrita al reversa");
        Scanner respuesta = new Scanner(System.in);
        String palabra = respuesta.nextLine();

        int longitud = palabra.length();
        String textoInvertido = "";
        int indice = longitud - 1;

        while (indice >= 0){
            textoInvertido += palabra.charAt(indice);
            indice--;
        }
        System.out.println("La palabra escrita al reves queda asi: " + textoInvertido);
    }
    public static void main(String[] args) {
        leerReversa();
    }
}
