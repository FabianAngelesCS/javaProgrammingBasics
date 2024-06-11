package com.Adstraccion.clasesAdstractas;
// Construcción de clase que hereda de la clase abstracta Personaje
public class Luchador extends Personaje {

    // Constructor que llama al constructor de la superclase
    public Luchador(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void habilidad() {
        System.out.println("La habilidad del luchador es volar");
    }
}
