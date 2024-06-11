package com.Adstraccion.clasesAdstractas;


// Definición de clase abstracta, que sirve como plantilla para otras clases.
public abstract class Personaje {

    // Declaración de variables
    private String nombre;
    private int edad;

    // Constructor para inicializar los atributos
    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Declaración de método abstracto
    public abstract void habilidad();
}
