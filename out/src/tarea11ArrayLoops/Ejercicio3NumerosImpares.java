package tarea11ArrayLoops;

public class Ejercicio3NumerosImpares {

    static void numeroImpar(){

        int[] numeros = {5, 6, 25, 35, 79, 135, 60, 80, 1121};

        for (int numero : numeros) {
            if (numero % 2 != 0)
                System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        numeroImpar();
    }
}
