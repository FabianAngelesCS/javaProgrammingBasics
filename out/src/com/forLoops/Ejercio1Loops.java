package com.forLoops;

import java.util.Scanner;

public class Ejercio1Loops {

    static void deletrearPalabra(){

        System.out.println("Ingresa una palabra para devolverte letra por letra: ");
        Scanner respusta = new Scanner(System.in);
        String palabra = respusta.nextLine();

        for (int i = 0; i< palabra.length(); i++){

            System.out.println(palabra.charAt(i));
        }

    }

    public static void main(String[] args) {
        deletrearPalabra();
    }
}
