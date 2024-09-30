package documentacion.Adstraccion.clasesAdstractas;

public class Main {
    public static void main(String[] args) {
        //Declaracion de objeto de Luchador
        Luchador luchador = new Luchador("Superman", 25);

        //Uso de los métodos heredados y sobreescritos.
        System.out.println("Personaje: " + luchador.getNombre());
        System.out.println("edad: " + luchador.getEdad());
        luchador.habilidad();
    }
}
