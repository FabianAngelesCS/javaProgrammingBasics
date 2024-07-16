package tareas.tarea11ArrayFoors;

public class Ejercicio1NumeroNegativo {

    static void numeroNegativo(){
        int[] numeros = {1, 2, 3, 4, -5, 6, 7, 8, 9};

        for (int numero : numeros){
            if (numero < 0){
                break;
            }
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        numeroNegativo();
    }
}
