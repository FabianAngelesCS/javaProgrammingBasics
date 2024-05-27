package Tarea15SustitucionMetodos.TercerEjercicioVehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();

        Vehiculo tractor = new Tractor();
        Vehiculo moto = new Moto();

        vehiculo.arrancar();
        tractor.arrancar();
        moto.arrancar();
    }

}
