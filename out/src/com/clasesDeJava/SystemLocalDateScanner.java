package com.clasesDeJava;

import java.time.LocalDate;
import java.util.Scanner;

public class SystemLocalDateScanner {

    public static void main(String[] args) {
        //clase para obtener fecha del equipo
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        //clase para obtener datos ingresados por usuario en la consola.
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombreUsuario = input.nextLine();
        System.out.println("nu nombre es: " + nombreUsuario);

    }
}
