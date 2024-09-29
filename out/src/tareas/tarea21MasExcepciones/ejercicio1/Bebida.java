package tareas.tarea21MasExcepciones.ejercicio1;

import java.time.LocalDate;

public class Bebida extends Producto {
    private LocalDate dateExpiration;
    private String typeProduct;

    public Bebida(String name, int price, LocalDate dateExpiration, String typeProduct) {
        super(name, price);
        this.dateExpiration = dateExpiration;
        this.typeProduct = typeProduct;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    @Override
    public LocalDate expiration() throws NullPointerException {
        if (dateExpiration == null) {
            throw new NullPointerException("La fecha de caducidad no fue ingresada, ");
        }
        return dateExpiration;
    }

    @Override
    public String type() throws NullPointerException {
        if (typeProduct == null) {
            throw new NullPointerException("El tipo de producto no fue ingresado");
        }
        return typeProduct;
    }
}
