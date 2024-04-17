package com.forLoops;

public class ejemploLoops {

    static void conteoNumeros(){

        for (int i = 50; i>10; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        //Estructura basica de un for loop
        for (int i= 0;i <6; i++){
            System.out.println(i);
        }

        //otro ejemplo
        conteoNumeros();
    }
}
