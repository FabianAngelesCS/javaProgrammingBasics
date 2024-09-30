package documentacion.DoWhile;

import java.util.Scanner;

public class EjemploDoWhile {

    static void numerosX(){


        int numero;
        do {
            System.out.println("Dame un numero cualquiera: ");
            Scanner respuesta = new Scanner(System.in);
            numero = respuesta.nextInt();
        }while (numero % 2 != 0);
        System.out.println("Numero par");


    }

    public static void main(String[] args) {
        numerosX();
    }


}
