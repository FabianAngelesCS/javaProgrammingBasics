package com.excepciones.EjercicioExcepciones;

public class Main {

    public static void main(String[] args) {
        Producto camisa = new Producto("Camisa", 0);
        try {
            camisa.comprarProducto(camisa);
        } catch (ProductoAgotadoExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
