package tareas.tarea21MasExcepciones.ejercicio2;

public class Coche extends Vehicle{

    public Coche(String type, String marca, int maxSpeed) {
        super(type, marca, maxSpeed);
    }

    @Override
    public void aceelerate() throws IllegalStateException {
        if (getCurrentSpeed() >= getMaxSpeed()) {
            throw new IllegalStateException("Peligro! el coche ya ha alcanzado su  velocidad maxima");
        }
        setCurrentSpeed(getCurrentSpeed() + 10);
    }
}
