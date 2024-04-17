package tarea12ArrayLoops;

public class Ejercicio5NumeroNegativo {

    static void numeroNegativo(){

        int[] numeros = {56, 89, 50, 86, 150, 7889, -55, 5687};

        int numeroBuscado = -55;
        int indice = 0;
        for (int numero : numeros){
            if (numero == numeroBuscado) {
                System.out.println("El número negativo esta el el indice: " + indice);
                break;
            }
            indice++;
        }
    }
    public static void main(String[] args) {
        numeroNegativo();
    }
}
