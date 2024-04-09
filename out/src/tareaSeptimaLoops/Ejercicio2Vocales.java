package tareaSeptimaLoops;

import java.util.Scanner;

public class Ejercicio2Vocales {

    static void vocalesPalabra(){

        System.out.println("Ingresa una palabra y te  dire cuantas vocales tiene: ");
        Scanner respuesta = new Scanner(System.in);
        String palabra = respuesta.nextLine();

        int numVocales = 0;
        for (int i=0; i<palabra.length(); i++){
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a'|| caracter == 'e'|| caracter =='i'|| caracter == 'o'|| caracter == 'u'){
                numVocales++;
            }
        }
        System.out.println("El numero de vocales de la palabra ingresada es: "+numVocales);
    }

    public static void main(String[] args) {
        vocalesPalabra();
    }
}
