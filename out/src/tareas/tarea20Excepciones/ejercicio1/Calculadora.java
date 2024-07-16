package tareas.tarea20Excepciones.ejercicio1;

public class Calculadora {

    public static double calcular(double num1, double num2, char operacion ) throws Excepciones{
        switch (operacion) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new Excepciones("No se puede dividir entre cero.");
                }
                return num1 / num2;
            default:
                throw new Excepciones("Operación no validad" + operacion);
        }

    }
}
