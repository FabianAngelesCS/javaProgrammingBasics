package tareas.tarea21MasExcepciones.ejercicio1;
import java.time.LocalDate;
public abstract class Producto {

    private String name;
    private int price;

    public Producto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrecio() {
        return price;
    }

    public abstract LocalDate expiration() throws NullPointerException;
    public abstract String type() throws NullPointerException;
}
