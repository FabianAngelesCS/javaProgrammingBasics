package tarea19Abstraccion.ejercicio2;

public class Main {

    public static void main(String[] args) {

        //Creación de instancia de clase bicicleta
        Movible desplazarBicicleta = new Bicicleta("Piernas");

        //Llamar al método mover
        desplazarBicicleta.mover();

        //Creación de instancia de clase bicicleta
        Movible dezplazarCarro = new Carro("Motor");
        //Llamar al método mover
        dezplazarCarro.mover();

    }

}
