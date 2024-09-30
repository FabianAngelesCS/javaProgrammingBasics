package tareas.tarea21MasExcepciones.ejercicio2;

public class Moto extends Vehicle{

    public Moto(String type, String marca, int maxSpeed) {
        super(type, marca, maxSpeed);
    }

    @Override
    public void aceelerate() throws IllegalStateException {
        if (getCurrentSpeed() >= getMaxSpeed()) {
            throw new IllegalStateException("Peligro! La motocicleta a alcanzado su velocidad maxima");
        }
        setCurrentSpeed(getCurrentSpeed() + 10);
    }
}
