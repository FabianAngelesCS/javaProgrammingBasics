package tareas.tarea21MasExcepciones.ejercicio2;

public abstract class Vehicle {

    private String type;
    private String marca;

    private int maxSpeed;
    private int currentSpeed;

    public Vehicle(String type, String marca, int maxSpeed) {
        this.type = type;
        this.marca = marca;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public abstract void aceelerate() throws IllegalStateException;

}
