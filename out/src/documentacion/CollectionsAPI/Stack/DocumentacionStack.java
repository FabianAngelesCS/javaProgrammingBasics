package documentacion.CollectionsAPI.Stack;
/*
La clase Stack en Java es una estructura de datos que representa una pila, donde los elementos se almacenan y se acceden
siguiendo el principio LIFO (Last In, First Out), es decir, el último elemento que se agrega es el primero en ser
eliminado.

La clase Stack forma parte del paquete java.util y extiende la clase Vector, lo que significa que también hereda algunas
de sus propiedades, como el almacenamiento dinámico de elementos. Sin embargo, Stack añade operaciones adicionales para
manejar los elementos como una pila.

Principales operaciones de Stack:
push(E item):

Añade (empuja) un elemento al tope de la pila.
pop():

Elimina y devuelve el elemento en la parte superior de la pila.
Lanza una excepción (EmptyStackException) si la pila está vacía.
peek():

Devuelve (pero no elimina) el elemento en la parte superior de la pila.
Lanza una excepción (EmptyStackException) si la pila está vacía.
isEmpty():

Verifica si la pila está vacía.
search(Object o):

Busca un elemento en la pila. Si lo encuentra, devuelve la posición de ese elemento desde la parte superior de la pila
(1 para el primer elemento, 2 para el siguiente, etc.). Si no lo encuentra, devuelve -1.
 */

// Ejemplo de uso de clase stack
import java.util.Stack;
public class DocumentacionStack {
    public static void main(String[] args) {
        // Crear una pila de enteros
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Ver el elemento en la parte superior
        System.out.println("Elemento en la parte superior: " + pila.peek());

        // Eliminar elementos de la pila
        System.out.println("Elemento eliminado: " + pila.pop());

        // Ver la pila después de eliminar
        System.out.println("Elemento en la parte superior después de pop: " + pila.peek());

        // Ver si la pila está vacía
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    }
}

/*
!IMPORTANTE! Esta clase ya no empleada en la actualidad, pues hay alternativas mejores...
Alternativa moderna: Deque
En lugar de usar Stack, es más común hoy en día utilizar Deque (doble cola), que permite un manejo más flexible y
eficiente de las operaciones de pila mediante los métodos addFirst(), removeFirst(), peekFirst(), etc.
 */
