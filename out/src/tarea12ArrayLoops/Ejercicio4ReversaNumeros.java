package tarea12ArrayLoops;

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio4ReversaNumeros {

    static  void  imprimirReversa(){

        //Uso de clase integer
        Integer[] numeros = {5, 2, 50, 66, 458, 1, 54, 76, 894};

        //ordenar decendente con clase Arrays
        Arrays.sort(numeros, Collections.reverseOrder());

        //imprimri con metodo de Arrays
        System.out.println(Arrays.toString(numeros));

        //imprimir usando metodo for each
        for (int numero : numeros){
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        imprimirReversa();
    }
}
