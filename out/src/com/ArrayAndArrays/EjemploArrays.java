package com.ArrayAndArrays;

import java.util.Arrays;

public class EjemploArrays {

    /*
    Un Arrays en Java es una clase que proporciona métodos estáticos útiles para trabajar con arrays. Esta clase no es
    un array en sí misma, sino que contiene métodos estáticos para manipular arrays de distintas maneras. Algunos de los
    métodos más comunes proporcionados por la clase Arrays incluyen la clasificación (sorting), la búsqueda (searching),
    la comparación y la conversión de arrays.

    Algunos ejemplos de métodos que proporciona la clase Arrays son:

    sort(): Ordena los elementos de un array en orden ascendente.
    binarySearch(): Busca un elemento en un array ordenado utilizando la búsqueda binaria.
    equals(): Compara dos arrays para verificar si son iguales.
    fill(): Rellena un array con un valor específico.
    copyOf(): Copia un array a otro con una longitud especificada.

     */
    static void arrayMercado(){

        int[] numeros = {6, 2, 5, 4, 2, 1,};
        Arrays.sort(numeros);

        //Declaracion de array, metodo moderno
        String[] verduleria  = {"zanahorias", "aguacates", "naranjas", "toronjas", "manzanas", "melones"};
        //metodo para ordenar ascendente los elementos del array
        Arrays.sort(verduleria);

        //metodo para imprimir el contenido de un array, usando la clase "Arrays"
        System.out.println(Arrays.toString(verduleria));
        System.out.println(Arrays.toString(numeros));

        //Metodo para copiar el contenidop de un array a otro:
        int[] masDatos = Arrays.copyOf(numeros,12);

        System.out.println(Arrays.toString(masDatos));

    }
    public static void main(String[] args) {
        arrayMercado();
    }

}


