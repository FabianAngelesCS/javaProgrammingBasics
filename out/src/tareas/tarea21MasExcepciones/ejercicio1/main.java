package tareas.tarea21MasExcepciones.ejercicio1;
/*
Crea la implementación de una clase abstracta Producto que tenga subclases como Comida, Bebida, etc. Cada
subclase debe implementar métodos abstractos como caducidad(), tipo(), etc. y lanzar excepciones específicas como
NullPointerException en caso de que se intente acceder a información que no ha sido proporcionada.
 */

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {
        LocalDate date = null;

        try {
            Comida papaya = new Comida("papaya", 30, date, "alimento");
            LocalDate dateExpiration = papaya.expiration();
            String typeProduct = papaya.type();
            System.out.printf("El tipo de producto es: %s\n", typeProduct);
            System.out.printf("La fecha de caducidad es: %s\n", dateExpiration);
        } catch (NullPointerException e) {
            System.out.printf("Se lanzo la excepcion NullPointerExcepcion: %s\n", e.getMessage());
        }
        try {
            Bebida soda = new Bebida("Friko", 10, date, "alimento");

            LocalDate dateExpeiration = soda.expiration();
            String typeProduct = soda.type();
            System.out.printf("El tipo de producto es: %s\n", typeProduct);
            System.out.printf("La fecha de caducidad es: %s\n", dateExpeiration);
        } catch (NullPointerException e) {
            System.out.printf("Se lanzo la excepcion NullPointerExcepcion: %s\n", e.getMessage());
        }
    }
}
