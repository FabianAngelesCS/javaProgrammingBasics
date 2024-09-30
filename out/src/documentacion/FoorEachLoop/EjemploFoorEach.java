package documentacion.FoorEachLoop;

public class EjemploFoorEach {

    /*

---¿QUE ES UN FOOR EACH LOOP?---

El bucle "for each" (también conocido como "enhanced for loop" o "for-each loop") es una construcción de lenguaje en
Java que permite iterar sobre los elementos de una colección o un array de manera sencilla y concisa.

La sintaxis básica del bucle "for each" en Java es la siguiente:

for (tipo elemento : colección) {
    // Cuerpo del bucle
}

Donde:
tipo es el tipo de datos de los elementos en la colección.
elemento es la variable que representa cada elemento de la colección en cada iteración del bucle.
colección es la colección sobre la cual se está iterando, como un array o una colección de objetos.
El bucle "for each" itera sobre cada elemento de la colección, asignando cada elemento a la variable elemento en cada
iteración del bucle. El bucle continúa hasta que todos los elementos de la colección hayan sido procesados.

Aquí tienes un ejemplo de cómo se usa el bucle "for each" para iterar sobre los elementos de un array:

int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
En este ejemplo, el bucle "for each" itera sobre cada elemento del array numeros e imprime cada elemento en la consola.
No es necesario especificar un índice o una condición de parada, ya que el bucle se encarga automáticamente de recorrer
todos los elementos de la colección.
     */
//EJEMPLO:
    static void interarCollecion(){

        int[] numeros = {1,2, 3, 4, 5, 6, 7, 8, 9};

        for (int numero : numeros){
            System.out.println(numero);
        }
    }
//SEGUNDO EJEMPLO:
    static void iterarColeccionString(){
        String[] tienda = {"refrescos", "galletas", "agua", "detergentes", "botanas"};

        for (String productos : tienda){
            System.out.println(productos);
        }
    }

    public static void main(String[] args) {
        interarCollecion();
        iterarColeccionString();
    }
}
