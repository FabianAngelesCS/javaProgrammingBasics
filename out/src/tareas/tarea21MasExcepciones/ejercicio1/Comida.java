package tareas.tarea21MasExcepciones.ejercicio1;

import java.time.LocalDate;

public class Comida extends Producto{
    private LocalDate dateExpiration;
    private String typeProduct;

    public Comida(String name, int price, LocalDate dateExpiration, String typeProduct) {
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
            throw new NullPointerException("La fecha de caducidad no ha sido ingresada. ");
        }
        return dateExpiration;
    }

    @Override
    public String type() throws NullPointerException {
        if (typeProduct == null) {
            throw new NullPointerException("El tipo de produto no fue registrado. ");
        }
        return typeProduct;
    }
}
