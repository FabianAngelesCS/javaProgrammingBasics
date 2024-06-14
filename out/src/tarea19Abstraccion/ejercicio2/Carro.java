package tarea19Abstraccion.ejercicio2;

public class Carro implements Movible {

    private String fuenteEnergia;

    //Constructor de clase
    public Carro(String fuenteEnergia) {
        this.fuenteEnergia = fuenteEnergia;
    }
    //Implementar metodo de interfaz
    @Override
    public void mover() {

        System.out.println("Para desplazar un carro necesitamos la energía de: " + fuenteEnergia);

    }
}
