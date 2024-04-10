package com.tiposVariables;

public class VariablesStaticas {

    //variable compartida por todas las instancias de la clase
    //Se puede acceder sin necesidad de crear un objeto de la clase
    //Se les asigna un valor determnaso igual que las variables de instancia.
    //Son guardadas en el heap

    //variable statica
    static int edad = 29;

    //variable local
    int hijos = 1;

    public static void main(String[] args) {

        VariablesStaticas persona1 = new VariablesStaticas();

        persona1.edad = 35;
        persona1.hijos = 2;

        VariablesStaticas persona2 = new VariablesStaticas();
        System.out.println(persona2.edad);
        System.out.println(persona2.hijos);
    }
}

