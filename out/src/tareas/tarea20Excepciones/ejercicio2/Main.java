package tareas.tarea20Excepciones.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Crea un programa que solicite al usuario un número entero y determine si es par o impar. Si el usuario ingresa un valor
no entero, el programa debería lanzar una excepción y mostrar un mensaje de error.
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bienvenido a al indentificador de números pares e impares");
            System.out.println("Ingresa un número para indentificarlo");

            while (!scanner.hasNextInt()) {
                throw new ExcepcionNumeroInvalido("Número invalido; ingresa un entero: ");
            }
            int numero = scanner.nextInt();
            NumeroParImpar.identificarNumero(numero);
        } catch (ExcepcionNumeroInvalido e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Se produjo un error al intentar leer el número");
        } finally {
            scanner.close();
        }
    }
}
