package com.tiposVariables;

public class VariableInstancia {

    //datos de clase fruta

    //com.variables de instancia
    //los cambian de objeto a objeto
    //Se declaran afuera de cualquier metodo o bloque de codigo
    //JVm les asigna un valos predeterminado a emnos que se les asigene manualmente
    // Null valor especial para representar la ausencia de un objeto o valor(solo para objetos)

    String nombre; //valor Null
    boolean comestible; //valor false
    String tipoFruta; // valor null


    public static void main(String[] args) {

        VariableInstancia fruta1 = new VariableInstancia();
        fruta1.nombre= "Naranja";

        VariableInstancia fruta2 = new VariableInstancia();
        fruta2.nombre = "platano";
    }
}
