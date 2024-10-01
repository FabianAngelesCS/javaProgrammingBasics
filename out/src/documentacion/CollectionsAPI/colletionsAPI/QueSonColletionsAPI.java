package documentacion.CollectionsAPI.colletionsAPI;

public class QueSonColletionsAPI {
/*
La Collection API en Java es un marco (framework) que proporciona un conjunto de clases e interfaces para trabajar con
colecciones de objetos. Las colecciones son estructuras que permiten almacenar, manipular y acceder a grupos de
elementos, como listas, conjuntos y mapas.

La Collection API facilita la manipulación de colecciones, proporcionando implementaciones reutilizables y
estandarizadas de estructuras de datos, lo que simplifica el trabajo de los desarrolladores y mejora la eficiencia del
código.

Principales interfaces de la Collection API:

Collection:
Es la interfaz raíz de la mayoría de las colecciones. Algunas de sus subinterfaces más comunes son:

    Map: Aunque no hereda de Collection, es parte del framework. Almacena pares clave-valor (por ejemplo, HashMap,
         TreeMap).
    List: Una colección ordenada que permite elementos duplicados (por ejemplo, ArrayList, LinkedList).
    Set: Una colección que no permite duplicados (por ejemplo, HashSet, TreeSet).
    Queue: Una colección que sigue la política FIFO (First In, First Out) (por ejemplo, LinkedList, PriorityQueue).

Clases de la Collection API:
    ArrayList: Una lista que permite acceso aleatorio rápido a los elementos.
    LinkedList: Lista basada en nodos enlazados, buena para inserciones/eliminaciones frecuentes.
    HashSet: Conjunto basado en hash que no permite duplicados.
    TreeSet: Un conjunto ordenado.
    HashMap: Estructura que almacena pares clave-valor sin orden garantizado.
    TreeMap: Un mapa ordenado según las claves.

Ejemplo básico de uso:
import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        for (String lenguaje : lista) {
            System.out.println(lenguaje);
        }
    }
}

Funcionalidades clave de la Collection API:
Búsqueda y ordenación de colecciones.
Inserción, eliminación, y recuperación de elementos.
Uso de iteradores para recorrer los elementos.
Métodos para convertir entre diferentes tipos de colecciones.
 */
}
