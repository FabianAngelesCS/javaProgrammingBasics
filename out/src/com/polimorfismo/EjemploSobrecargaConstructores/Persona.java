package com.polimorfismo.EjemploSobrecargaConstructores;

public class Persona {
    //Declaracion de variables
    private String nombre;
    private int edad;


    //Uso de sobrecarga de constructor
    //Mediante el empleo de diferentes parametros.
    public Persona() {
        this.nombre = "N/A";
        this.edad = 0;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int edad) {
        this.nombre = "N/A";
        this.edad = edad;
    }

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
}
