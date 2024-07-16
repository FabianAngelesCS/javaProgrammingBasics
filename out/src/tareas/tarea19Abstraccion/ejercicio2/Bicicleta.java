package tareas.tarea19Abstraccion.ejercicio2;

public class Bicicleta implements Movible{
   private String fuenteEnergia;

   //Constructor de clase
    public Bicicleta(String fuenteEnergia) {
        this.fuenteEnergia = fuenteEnergia;
    }

    //Implementar metodo de interfaz
    @Override
    public void mover() {
        System.out.println("Para desplazar una bicicleta nececitamos la energía de: " + fuenteEnergia);

    }
}
