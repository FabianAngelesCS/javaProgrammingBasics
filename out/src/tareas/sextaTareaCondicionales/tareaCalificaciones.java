package tareas.sextaTareaCondicionales;

import java.util.Scanner;

public class tareaCalificaciones {

    static void puntajeCalificaion (){
        System.out.println("Te ayudare a saber el puntaje equivalente a tu calificaión alfanumerica");
        System.out.println("Ingresa tu calificación; A,B,C,D o F: ");
        Scanner respuesta = new Scanner(System.in);
        String calificacionLetra = respuesta.nextLine();
        char calificacion = calificacionLetra.charAt(0);

        if (calificacion == 'f')
            System.out.println("Tu calificación equivale a 0");
        else if (calificacion == 'd')
            System.out.println("Tu calificaciòn equivale a 1");
        else if (calificacion == 'c')
            System.out.println("Tu calificaion equivale a 2");

        else if (calificacion == 'b')
            System.out.println("tu calificación equivale a 3");
        else
            System.out.println("Tu calificación equivale a 4");
    }

    public static void main(String[] args) {
        puntajeCalificaion();
    }

}

