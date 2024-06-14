package tarea19Abstraccion.ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contrasena = sc.nextLine();

        Accesible guardarContrasena = new Usuario();
        guardarContrasena.setContraseña(contrasena);


        String dataContrasena = guardarContrasena.getContrasena();
        System.out.println("La contraseña guardada es: " + dataContrasena);


    }
}
