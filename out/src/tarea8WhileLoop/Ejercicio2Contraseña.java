package tarea8WhileLoop;

import java.util.Scanner;

public class Ejercicio2Contraseña {

    static void contrasenaTrue(){
        String contrasena = "Estaeslacontrasena";

        System.out.println("Ingresa la contraseña para acceder al sistema");
        Scanner respuesta = new Scanner(System.in);
        String acceso = respuesta.nextLine();

        while (!acceso.equals(contrasena)){
            System.out.println("Contraseña incorrecta, vuelve a intentarlo");
            acceso = respuesta.nextLine();
        }
        System.out.println("La contraseña es correcta, bienvenido al sistema");
    }

    public static void main(String[] args) {
        contrasenaTrue();
    }
}
