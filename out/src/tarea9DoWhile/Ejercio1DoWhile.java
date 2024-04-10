package tarea9DoWhile;

import java.util.Scanner;

public class Ejercio1DoWhile {

    static void numeroCorrecto(){

        int numero;
        do {
            System.out.println("Ingresa un numero entero del 1-10: ");
            Scanner respuesta = new Scanner(System.in);
            numero = respuesta.nextInt();
        }while (numero != 8);
            System.out.println("El numero es correcto");
    }
    public static void main(String[] args) {
        numeroCorrecto();
    }
}
