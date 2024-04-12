package com.ArrayAndArrays;

public class EjemploArray {

    static void arrayMercado(){

        //Declaracion de array, metodo moderno
        String[] verduleria  = {"zanahorias", "aguacates", "naranjas", "toronjas", "manzanas", "melones"};

        for (int i=0; i < verduleria.length; i++){
            System.out.println(verduleria[i]);
        }
    }
    public static void main(String[] args) {

        arrayMercado();
    }

}
