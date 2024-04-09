package tarea8WhileLoop;

import java.util.Scanner;

public class Ejercicio1 {
    static void contadorLetras(){
        System.out.println("Ingresa un texto y te dire cuantas letras tiene este: ");
        Scanner respuesta = new Scanner(System.in);
        String texto = respuesta.nextLine();
        int contadorL =0;
        int indice = 0;
        while (indice < texto.length()){
            char letra = texto.charAt(indice);
            if (Character.isLetter(letra)){
                contadorL++;
            }
            indice++;
        }
        System.out.println("El numero de letras que tiene el texto es " + indice + " letras");
    }

    public static void main(String[] args) {
        contadorLetras();
    }
}
