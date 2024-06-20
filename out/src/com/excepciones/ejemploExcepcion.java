package com.excepciones;

public class ejemploExcepcion {

    public static void main(String[] args) {
        //Bloque para manejar excepciones
        try{
            int[] numbers = {2,3,4};
            System.out.println(numbers[4]);
            //Impresión de error en consola
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
