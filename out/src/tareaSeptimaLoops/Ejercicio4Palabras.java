package tareaSeptimaLoops;

import java.util.Scanner;

public class Ejercicio4Palabras {

    static void contadorPalabras(){

        System.out.println("Ingresa un texto y te dare la cantidad de palabras que este contiene: ");
        Scanner respuesta = new Scanner(System.in);
        String texto = respuesta.nextLine();

        int conteoPalabras = 1;

        for (int i = 0; i<texto.length(); i++){

            if (texto.charAt(i) == ' '){
                conteoPalabras++;
            }
        }
        System.out.println("El texto ingresado tiene "+ conteoPalabras + " palabras.");
    }

    public static void main(String[] args) {
        contadorPalabras();
    }
}
