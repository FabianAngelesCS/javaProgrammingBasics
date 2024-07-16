package com.excepciones.EjercicioExcepciones;

public class Producto {
    private String tipo;
    private int catidad;

    public Producto(String tipo, int catidad) {
        this.tipo = tipo;
        this.catidad = catidad;
    }

    public void comprarProducto(Producto producto) throws ProductoAgotadoExcepcion{
        if (producto.getCatidad() <= 0){
            throw new ProductoAgotadoExcepcion("producto agotado");
        }else {
            throw new ProductoAgotadoExcepcion("Compra realizada con exito");
            //resto de implementacion
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }
}
