package tareaSeptimaLoops;

import java.util.Scanner;

public class Ejercicio3Letras {

    static void numeroLetrasTexto(){

        System.out.println("Ingresa una frase y te dire cuantas letras tiene");
        Scanner respuesta = new Scanner(System.in);
        String cadenaTexto = respuesta.nextLine();

        int numeroLetras = 0;
        for (int i = 0; i< cadenaTexto.length(); i++){
            char caracter = Character.toLowerCase(cadenaTexto.charAt(i));
            if (Character.isLetter(caracter)){
                numeroLetras++;
            }
        }
        System.out.println("La cadena de texto ingresada tiene " + numeroLetras+ " letras");
    }

    public static void main(String[] args) {
        numeroLetrasTexto();
    }
}
