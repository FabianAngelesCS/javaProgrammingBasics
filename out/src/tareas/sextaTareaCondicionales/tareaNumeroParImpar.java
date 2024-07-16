package tareas.sextaTareaCondicionales;

import java.util.Scanner;

public class tareaNumeroParImpar {

    static void numeroParImpar(){
        System.out.println("Ingresa un numero entero y te dire si es par o impar: ");
        Scanner respuesta = new Scanner(System.in);
        int numero = respuesta.nextInt();

        String mensaje = numero % 2 == 0 ? "El número es par" : "El número es impar";
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        numeroParImpar();
    }
}
