package com.POOHerencia;

//extendemos la clase padre para emplearla
public class Fabian extends papa {


    public static void main(String[] args) {
        Fabian fabian = new Fabian();
        // reutlizamos modulos de la clase padre.
        System.out.println(fabian.altura);
        System.out.println(fabian.apellido);
        System.out.println(fabian.entradas);
    }



}
