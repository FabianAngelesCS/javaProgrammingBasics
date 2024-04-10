package com.tiposVariables;

public class VariableLocal {

    static void imprimirNumeros(){
        //Ejemplo de una variable local, "i" solo padra ser usada en este loop.
        //Se alamacena en el stack.
        //Jvm no le asigna valores predeterminados
        //siempre deberan ser inicializadas a menos que sean usadas como un parametro en un metodo.
        for (int i = 0; i <=30; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        imprimirNumeros();
    }
}
