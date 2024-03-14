package variables;

public class whatIsVariable {

    /*
    """ Qué es una variable?

En Java, una variable es un espacio de memoria que se utiliza para almacenar datos temporales o valores que pueden
 cambiar durante la ejecución del programa. Las variables tienen un nombre único que se utiliza para referirse a ellas
 y un tipo que especifica qué tipo de datos pueden contener. Las variables se utilizan para almacenar información que
 puede ser procesada o manipulada por el programa.

En Java, las variables se pueden dividir en dos categorías principales:

Variables locales:
Son variables definidas dentro de un método, constructor o bloque. Estas variables solo son accesibles dentro del
ámbito en el que se han declarado. Tienen que ser inicializadas antes de ser utilizadas.
Ejemplo:
------------------------------------------------------------------------------------------------------------------------

public void ejemplo() {
    int edad = 30; // variable local
    System.out.println(edad);
}
------------------------------------------------------------------------------------------------------------------------

Variables de instancia (o miembros de clase):
Son variables definidas dentro de una clase pero fuera de cualquier
método. Estas variables son parte del estado de un objeto y cada instancia de la clase tiene su propia copia de estas
variables. Tienen valores predeterminados si no se inicializan explícitamente.
Ejemplo:
------------------------------------------------------------------------------------------------------------------------
public class Persona {
    String nombre; // variable de instancia
    int edad; // variable de instancia

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
------------------------------------------------------------------------------------------------------------------------

Además, en Java, las variables también pueden ser clasificadas según su modificador de acceso:

public: La variable es accesible desde cualquier clase.
protected: La variable es accesible dentro del mismo paquete y por subclases, incluso si están en paquetes diferentes.
private: La variable solo es accesible dentro de la misma clase.
package-private (sin modificador): La variable es accesible solo dentro del mismo paquete.

     */

}
