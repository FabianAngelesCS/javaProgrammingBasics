package documentacion.Encapsulacion;

public class Constructores {

    /*

----¿QUE SON LOS CONSTRUCTORES----

Los constructores en Java son métodos especiales que se utilizan para inicializar objetos de una clase. Se llaman
automáticamente cuando se crea una instancia (objeto) de la clase y se utilizan para realizar cualquier inicialización
necesaria, como asignar valores iniciales a los atributos de la clase.

Algunas características importantes de los constructores en Java son:

Nombre idéntico a la clase:
El nombre del constructor debe ser idéntico al nombre de la clase en la que se encuentra.

No tiene tipo de retorno explícito:
A diferencia de otros métodos, los constructores no tienen un tipo de retorno explícito, ni siquiera void.

Pueden tener parámetros:
Los constructores pueden tener parámetros que se utilizan para proporcionar valores iniciales a los atributos de la
clase al crear un objeto.

Puede haber múltiples constructores:
Una clase puede tener múltiples constructores, siempre que tengan diferentes listas de parámetros (lo que se conoce
como sobrecarga de constructores).

Aquí tienes un ejemplo básico de cómo se ve un constructor en Java:

EJEMPLO:
------------------------------------------------------------------------------------------------------------------------
public class Persona {
    private String nombre;
    private int edad;

    // Constructor sin parámetros (constructor por defecto)
    public Persona() {
        // Inicialización por defecto
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        // Inicialización con los valores proporcionados
        this.nombre = nombre;
        this.edad = edad;
    }
}
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, la clase Persona tiene dos constructores: uno sin parámetros (constructor por defecto) y otro con
parámetros. El constructor sin parámetros se utiliza para crear objetos con valores iniciales predeterminados,
mientras que el constructor con parámetros se utiliza para crear objetos con valores específicos proporcionados por
el usuario al momento de la creación.

     */
}
