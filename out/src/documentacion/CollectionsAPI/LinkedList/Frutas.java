package documentacion.CollectionsAPI.LinkedList;

import java.util.LinkedList;

/*
Ejemplo de implemtacion de linkedList
 */
public class Frutas {

    public static void main(String[] args) {
        LinkedList canastaFrutas = new LinkedList();
        canastaFrutas.add("Naranja");
        canastaFrutas.add("Pera");
        canastaFrutas.add("Pera");
        canastaFrutas.add("Limon");
        canastaFrutas.add("Manzana");
        canastaFrutas.add("Platano");

        // Metodos para eliminar el primer y ultimo elemento dentro de LinkedList
        canastaFrutas.removeFirst();
        canastaFrutas.removeLast();
        System.out.println(canastaFrutas);

    }
}
