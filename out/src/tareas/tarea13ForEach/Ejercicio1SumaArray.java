package tareas.tarea13ForEach;

public class Ejercicio1SumaArray {

    static  void sumarNumerosCadena(){

        int[] sumarNumeros = {456, 23, 56, 75, 96, 86, 23, 56};

        int sumaTotla = 0;

        for (int numero : sumarNumeros) {
            sumaTotla += numero ;
        }
        System.out.println("La suma total de los números del array es: "+ sumaTotla);
    }

    public static void main(String[] args) {
        sumarNumerosCadena();
    }

}
