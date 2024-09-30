package tareas.tarea21MasExcepciones.ejercicio2;
/*
Crea la implementación de una clase abstracta Vehiculo que tenga subclases como Coche, Motocicleta, etc.
Cada subclase debe implementar métodos abstractos como acelerar(), frenar(), etc. y lanzar excepciones específicas
como IllegalStateException en caso de que se intente acelerar un vehículo que ya está a su velocidad máxima.
 */
public class Main {

    public static void main(String[] args) {

        try {
            Coche Corola = new Coche("Car", "Toyota", 150);
            while (Corola.getCurrentSpeed() < Corola.getMaxSpeed()) {
                Corola.aceelerate();
            }
            System.out.println("Velocidad actual: " + Corola.getCurrentSpeed());

            // Intentar acelerar de nuevo
            Corola.aceelerate();
            System.out.println("Velocidad actual: " + Corola.getCurrentSpeed());
        } catch (IllegalStateException e) {
            System.out.println("Se lanzo la excepcion IllegalStateException " + e.getMessage());
        }

        try {
            Moto motorcycle = new Moto("motocicleta", "Honda", 100);
            while (motorcycle.getCurrentSpeed() < motorcycle.getMaxSpeed()) {
                motorcycle.aceelerate();
            }
            System.out.println("La velocidad actual de la motocicleta es: " + motorcycle.getCurrentSpeed());

            // Intentar acelerar de nuevo
            motorcycle.aceelerate();
            System.out.println("La velocidad actula de la motocicleta es: " + motorcycle.getCurrentSpeed());
        } catch (IllegalStateException e) {
            System.out.println("Se lanzo la excepcion IllegalStateException " + e.getMessage());
        }
    }
}
