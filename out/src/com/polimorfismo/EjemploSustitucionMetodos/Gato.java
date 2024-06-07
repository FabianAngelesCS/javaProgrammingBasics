package com.polimorfismo.EjemploSustitucionMetodos;

public class Gato extends Animal {

    //Empleo del metodo overraide para sustituir el comportamiento de este mismo que fue
    // heredado desde la clase padre.
    @Override
    public void hacerSonido(){
        System.out.println("Miauuuuuuuuuu! miau!!");
    }
}
