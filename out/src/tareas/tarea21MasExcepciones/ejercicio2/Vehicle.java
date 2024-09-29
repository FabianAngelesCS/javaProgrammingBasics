package tareas.tarea21MasExcepciones.ejercicio2;

import java.time.LocalDate;

public abstract class Vehicle {

    private String type;
    private String marca;

    public Vehicle(String type, String marca) {
        this.type = type;
        this.marca = marca;
    }

    public String getType() {
        return type;
    }

    public String getMarca() {
        return marca;
    }

    public abstract String expiration() throws NullPointerException;
    public abstract String type() throws NullPointerException;
}
