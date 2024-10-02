package documentacion.CollectionsAPI.arrayList;

public class queEsUnArrayList {
/*
ArrayList es una implementación de la interfaz List en Java que utiliza un array dinámico para almacenar los elementos.
Es una de las colecciones más utilizadas por su facilidad de uso y rendimiento en la mayoría de las operaciones.

Características de ArrayList:
Array dinámico:
    A diferencia de un array regular de Java, el ArrayList puede crecer y reducir su tamaño dinámicamente a
    medida que se añaden o eliminan elementos.
Acceso rápido:
    Proporciona acceso rápido a los elementos mediante índices, ya que es similar a un array.
Permite duplicados:
    Los elementos pueden repetirse.
Orden de inserción:
    Mantiene el orden de los elementos tal como se añaden.
No es sincronizado:
    No es seguro para el acceso concurrente sin medidas adicionales.

Métodos comunes:
add(E e):
    Añade un elemento al final del ArrayList.
add(int index, E element):
    Inserta un elemento en una posición específica.
remove(int index):
    Elimina el elemento en la posición dada.
get(int index):
    Obtiene el elemento en el índice especificado.
size():
    Retorna el número de elementos en el ArrayList.
contains(Object o):
    Verifica si el ArrayList contiene el elemento dado.
clear():
    Elimina todos los elementos del ArrayList.
    
Ventajas:
Acceso rápido a elementos: Debido a su naturaleza de array, la operación get() es rápida.
Crecimiento automático: El ArrayList ajusta automáticamente su tamaño cuando se agregan más elementos.
Desventajas:
Costoso en inserciones/eliminaciones intermedias: Las operaciones como inserción o eliminación en posiciones específicas pueden ser costosas, ya que requiere mover otros elementos para mantener el orden.
Ejemplo básico:
java
Copiar código
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Acceder a un elemento
        System.out.println("Elemento en índice 1: " + lista.get(1));  // Python

        // Eliminar un elemento
        lista.remove(2);

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.size());  // 2

        // Verificar si contiene un elemento
        if (lista.contains("Java")) {
            System.out.println("La lista contiene 'Java'");
        }
    }
}
ArrayList es ideal cuando se necesita un acceso rápido a los elementos y no se realizan muchas inserciones o eliminaciones en posiciones intermedias.
 */
}
