package documentacion.CollectionsAPI.arrayList;
/*
Ejemplo de un arrayList
 */
import java.util.ArrayList;

public class ListaCompras {

    public static void main(String[] args) {
        // Crear un ArrayList de Strings
        ArrayList lista = new ArrayList<>();
        lista.add("manzana");
        lista.add("Sopa");
        lista.add("detergente");

        lista.remove("Sopa");

        // Imprimir los elementos de la lista con println
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.indexOf("detergente"));

    }
}
