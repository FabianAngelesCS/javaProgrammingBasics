package tarea16sobrecargaConstructores.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        //Creacion de objetos de la clase coche conlos constructores y aplicando el método de sobrecarga de estos.
        Coche coche = new Coche("toyota", "Corola");
        Coche coche1 = new Coche("Toyota", "Yariss", 2015);

        //Impresión de datos

        System.out.println(coche.getMarca() + "--" + coche.getModelo() + "--" + coche.getAño());
        System.out.println(coche1.getMarca() + "--" + coche1.getModelo() + "--" + coche1.getAño());
    }
}
