package documentacion.CollectionsAPI.LinkedList;
/*
LinkedList es una de las clases de la Collection Framework en Java, específicamente en el paquete java.util, que
implementa la interfaz List y Deque (doble cola). Esta clase permite almacenar elementos en una lista enlazada
(doubly linked list), lo que significa que cada elemento (o nodo) está conectado al anterior y al siguiente, permitiendo
inserciones y eliminaciones más eficientes en comparación con estructuras como ArrayList, cuando estas operaciones
ocurren en posiciones intermedias o al principio de la lista.

Características principales de LinkedList:
Almacenamiento dinámico:
A diferencia de los ArrayList, donde el tamaño está restringido por la capacidad subyacente del array, en un LinkedList
el tamaño se expande o reduce dinámicamente cuando se agregan o eliminan elementos.
Cada nodo del LinkedList contiene:
Un dato (el valor del nodo).
Una referencia al nodo anterior.
Una referencia al nodo siguiente.

Operaciones eficientes en inserciones y eliminaciones:

Las inserciones o eliminaciones de elementos en el medio de una LinkedList son más eficientes que en un ArrayList,
porque no es necesario mover elementos. Solo se ajustan las referencias entre nodos.
Acceder a elementos por índice en un LinkedList es más costoso que en un ArrayList, ya que se debe recorrer la lista
desde el principio (o desde el final si está más cerca) hasta el índice especificado.

Implementación de List y Deque:

List:
Como implementa la interfaz List, permite acceso, modificación, adición y eliminación de elementos en cualquier
posición de la lista.
Deque:
Como implementa la interfaz Deque (doble cola), permite operaciones tanto desde el inicio como desde el final de
la lista (por ejemplo, métodos como addFirst(), addLast(), removeFirst(), removeLast(), etc.).

Métodos importantes en LinkedList:

Inserción:
add(E element)            // Añade un elemento al final de la lista.
addFirst(E element)       // Añade un elemento al inicio de la lista.
addLast(E element)        // Añade un elemento al final de la lista.

Acceso:
get(int index)            // Devuelve el elemento en el índice especificado.
getFirst()                // Devuelve el primer elemento.
getLast()                 // Devuelve el último elemento.

Eliminación:
remove()                  // Elimina el primer elemento.
remove(int index)         // Elimina el elemento en el índice especificado.
removeFirst()             // Elimina el primer elemento.
removeLast()              // Elimina el último elemento.

Ventajas de LinkedList:
Inserción y eliminación rápidas: Cuando se trata de insertar o eliminar elementos en el medio o al principio, es mucho
más eficiente que un ArrayList.
Flexible:
Al implementar tanto List como Deque, puede usarse como lista o como cola doble.

Desventajas de LinkedList:
Acceso más lento por índice: Acceder a un elemento en una posición específica es más lento comparado con un ArrayList,
ya que se debe recorrer la lista hasta encontrar el índice deseado.
Mayor consumo de memoria: Cada nodo en la LinkedList tiene referencias a los nodos adyacentes, lo que requiere más
memoria que un ArrayList, donde solo se almacena el valor de los elementos.
 */

//Ejemplo de uso de LinkedList:
import java.util.LinkedList;
public class LinkedListDocumentacion {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Agregar elementos
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        // Agregar al inicio y al final
        lista.addFirst("Durazno");
        lista.addLast("Fresa");

        // Acceder a elementos
        System.out.println("Primero: " + lista.getFirst());
        System.out.println("Último: " + lista.getLast());

        // Recorrer la lista
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        // Eliminar elementos
        lista.removeFirst();   // Elimina el primer elemento
        lista.removeLast();    // Elimina el último elemento

        System.out.println("Después de eliminar:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
}
