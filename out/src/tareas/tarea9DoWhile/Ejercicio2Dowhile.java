package tareas.tarea9DoWhile;

import java.util.Scanner;

public class Ejercicio2Dowhile {

    static void palabraCorrecta(){

        String palabra;
        do {
            System.out.println("Ingresa una palabra con 5 letras: ");
            Scanner respuesta = new Scanner(System.in);
            palabra = respuesta.nextLine();
        }while (palabra.length() != 5);
        System.out.println("La palabra tiene la cantidad de caracteres correcta");
    }
    public static void main(String[] args) {
        palabraCorrecta();
    }


}
