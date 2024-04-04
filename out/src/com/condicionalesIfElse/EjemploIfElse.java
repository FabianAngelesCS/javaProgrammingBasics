package com.condicionalesIfElse;

import java.util.Scanner;

public class EjemploIfElse {



    public static void main(String[] args) {
        System.out.printf("¿Te sientes con energia hoy? ");
        Scanner repuesta = new Scanner(System.in);
        String siNO =repuesta.nextLine();
        String sinEnergia = "no";
        String conEnergia = "si";
        if (siNO.equalsIgnoreCase(conEnergia))
            System.out.printf("De acuerdo, comenzaremos a trabajar en los pendientes.");

        else
            System.out.printf("De acuerdo, descansa hasta medio dia y despues continuas con tus pendientes.");

    }
}
