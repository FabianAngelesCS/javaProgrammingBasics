package tarea18StringBuilderyStringBuffer;
/*
Crea un programa que reciba una lista de palabras y las ordene en orden alfabético, utilizando un objeto StringBuffer
para concatenar las palabras ordenadas.
 */

import static java.util.Collections.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ejercicio5 {

    //Método para ordenar alfabeticmaente lista de palabras
    public static void ordenAlfabetico(String[] palabras){
        //Crar list para almacenar palabras
        List<String> palabrasOrden = new ArrayList<>();

        //Añadir la lista de palabras a ArrayList.
        Collections.addAll(palabrasOrden, palabras);

        //Ordenar en orden alfabetico
        Collections.sort(palabrasOrden);

        //objeto de StringBuffer para concatenar cada palabra
        StringBuffer palabrasConcatenadas = new StringBuffer();

        //Concatenar las palabras
        for (String palabra: palabrasOrden){

            palabrasConcatenadas.append(palabra).append(" ");
        }

        //DEvolver resultados impresos
        System.out.println(palabrasConcatenadas.toString());

    }

    public static void main(String[] args) {
        //Definir lista de palabras para ordenar
        String[] palabras = {"Hello", "wordl", "mira", "estoy", "concatenanado", "con", "StringBuilder"};

        //Llamar a método para ordenar lsirta d epalabras
        ordenAlfabetico(palabras);
    }
}
