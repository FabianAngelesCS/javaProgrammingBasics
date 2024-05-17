package tarea14PolimorfismoSobrecarga;

public class SegundoEjercicioTexto {

    public void dialogo(String oracion){
        System.out.println( oracion.toUpperCase());
    }

    public void dialogo(String oracion, String oracionDos){
        System.out.println(oracion + oracionDos);
    }

    public static void main(String[] args) {
        SegundoEjercicioTexto texto = new SegundoEjercicioTexto();

       texto.dialogo("Hola mundo... ");
       texto.dialogo("Hola mundo...", " estoy sobrecargando el método");


    }
}
