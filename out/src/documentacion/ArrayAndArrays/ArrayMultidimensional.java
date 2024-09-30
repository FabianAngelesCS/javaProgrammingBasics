package documentacion.ArrayAndArrays;

import java.util.Arrays;

public class ArrayMultidimensional {

    /*
Un array multidimensional es un array cuyos elementos son también arrays. Esto permite representar datos en una
estructura de múltiples dimensiones, como una tabla o una matriz.

Los arrays multidimensionales en Java se pueden pensar como matrices o tablas con filas y columnas. Por ejemplo, puedes
tener una matriz bidimensional para representar una tabla de filas y columnas, o incluso matrices tridimensionales para
representar datos en un espacio tridimensional.

La sintaxis básica para declarar y crear un array multidimensional en Java es similar a la de un array unidimensional,
pero con más dimensiones. Aquí tienes algunos ejemplos:

------------------------------------------------------------------------------------------------------------------------
// Array bidimensional (matriz)
int[][] matriz = new int[3][3];

// Inicializar una matriz bidimensional
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Array tridimensional
int[][][] cubo = new int[3][3][3];
En el primer ejemplo, se declara una matriz bidimensional de enteros llamada matriz con 3 filas y 3 columnas. En el
segundo ejemplo, se inicializa una matriz bidimensional con valores específicos. En el tercer ejemplo, se declara un
array tridimensional llamado cubo.

Para acceder a los elementos de un array multidimensional, necesitas especificar el índice para cada dimensión.
Por ejemplo:

// Acceder al elemento en la fila 1, columna 2 de la matriz
int elemento = matriz[1][2];

Los arrays multidimensionales son útiles para representar datos estructurados en múltiples dimensiones, como matrices,
tablas, cubos, entre otros. Permiten organizar y manipular datos de manera más eficiente y conveniente.
     */

    static void cuadricula(){

        //Creacion de array multidimensional basado en cuadricula 3*3 de colores
        String[][] coloresCuadricula = new String[3][3 ];

        coloresCuadricula[0][0] = "rojo";
        coloresCuadricula[1][2] = "morado";
        coloresCuadricula[2][2] = "gris";

        //Metodo para imprimir array multidimensional.
        System.out.println(Arrays.deepToString(coloresCuadricula));

    }
    public static void main(String[] args) {
        cuadricula();
    }

}
