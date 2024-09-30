package tareas.tarea21MasExcepciones.ejercio3;
/*
Crea la implementación de una clase abstracta Empleado que tenga subclases como Gerente, Trabajador, etc.
Cada subclase debe implementar métodos abstractos como calcularSalario(), calcularBonificaciones(), etc. y lanzar
excepciones específicas como ArithmeticException en caso de que se intente dividir por cero al calcular el salario.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Gerente gerente = new Gerente("Avril", "Gerente", 30,0, 350);
            gerente.calculateSalary();
            gerente.calculateBonus();

            int totalSalary = gerente.getSalary() + gerente.getBaseBonus();

            System.out.println("El salario total del gerente es: " + totalSalary);
        } catch (ArithmeticException e) {
            System.out.println("Error al calcular salrio o bonus: " + e.getMessage());
        }
    }
}
