package tareas.tarea20Excepciones.ejercicio3;

import tareas.tarea20Excepciones.ejercicio2.ExcepcionNumeroInvalido;

import java.util.Scanner;

/*
Crea un programa que lea una cadena de texto desde el usuario y que lance una excepción si la cadena no se puede
convertir a un número entero.
*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bievenido al conversor de numeros en letras a numeros enteros.");
        System.out.println("Ingresa el nombre de un numero");

        String nombre = scanner.nextLine();

        try {
            int numero = ConversorNumero.convertirNumero(nombre);
            System.out.println("El número es: " + numero);
        }catch (ExcepcionNoConversion e) {
            System.out.println(e.getMessage());
        }
        scanner.close();

    }
}
