package tareas.tarea13ForEach;

public class Ejercicio3Promedio {

    static void calcularPromedio(){

        int[] numeros = {56,88, 99, 44, 77, 11, 33, 55};

        int contadordatos = numeros.length;
        int sumaTotal = 0;

        for (int numero : numeros){
            sumaTotal += numero;
        }
        float promedio = (float) sumaTotal / contadordatos;
        System.out.println("El promedio de los datos del array es: " + promedio);

    }

    public static void main(String[] args) {
        calcularPromedio();
    }
}
