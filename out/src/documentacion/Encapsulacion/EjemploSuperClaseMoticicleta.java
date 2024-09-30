package documentacion.Encapsulacion;
// Declaramos la super clase con sus getters y constructor parametrizado.
public class EjemploSuperClaseMoticicleta {

    private String marca;
    private int cilindraje;

    public EjemploSuperClaseMoticicleta(String marca, int cilindraje) {
        this.marca = marca;
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}
