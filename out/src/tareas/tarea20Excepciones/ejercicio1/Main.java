package tareas.tarea20Excepciones.ejercicio1;

import java.util.Scanner;

/*
Crea una calculadora que solicite dos números al usuario y la operación que desea realizar (+, -, *, /). Si el usuario
ingresa una operación no válida o intenta dividir entre cero, la calculadora debería lanzar una excepción y mostrar un
mensaje de error.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bienvenido a tu calculadora!");
            System.out.println("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Elige la operación que deseas realizar: ");
            char operacion = scanner.next().charAt(0);

            double resultado = Calculadora.calcular(num1, num2, operacion);
            System.out.println("El resultado de la operacion es: " + resultado);
        } catch (Excepciones e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado");
        } finally {
            scanner.close();;
        }
    }
}
