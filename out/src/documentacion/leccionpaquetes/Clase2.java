package documentacion.leccionpaquetes;

import documentacion.segundopaqueteejemploleccion.Clase3;

public class Clase2 {

    void metodo2(){
        System.out.println("Estoy en la clase 2");
    }

    public static void main(String[] args) {

        Clase1 clase1 = new Clase1();
        clase1.metodo1();

        Clase2 clase2 = new Clase2();
        clase2.metodo2();

        Clase3 clase3 = new Clase3();
        clase3.metodo3();
    }
}
