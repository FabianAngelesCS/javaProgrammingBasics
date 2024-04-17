package com.RelationalOperators;

public class operadoresObjetos {

    public static void main(String[] args) {
        operadoresObjetos usuario1 = new operadoresObjetos();
        operadoresObjetos usuario2 = new operadoresObjetos();

        //aqui en esta comparacion, estamos comparando el lugar donde esta almacenado, no el contenido
        System.out.println(usuario2 == usuario1);
    }
}
