package tarea16sobrecargaConstructores.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        //instancia de la clase Empleado para emplear los constructores aplicnadoles el metodo de sobrecarga
        // de estos mismos.

        Empleado empleado = new Empleado("Arquimedes L.", 11_400F);
        Empleado empleado1 = new Empleado("Fabian A", 11_400F, "04-10-2023");

        //Impresión de resultados
        System.out.println(empleado.getName() + "--" + empleado.getSalario() + "--" + empleado.getFechaContratacion());
        System.out.println(empleado1.getName() + "--" + empleado1.getSalario() + "--" + empleado1.getFechaContratacion());
    }
}
