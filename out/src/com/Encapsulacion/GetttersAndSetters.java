package com.Encapsulacion;

public class GetttersAndSetters {

    /*

----GETTERS AND SETTERS----

Los getters y setters en Java son métodos utilizados para acceder y modificar los valores de las variables
privadas (o campos) de una clase. Estos métodos permiten implementar el principio de encapsulación, que
consiste en ocultar los detalles internos de una clase y controlar el acceso a sus atributos.

Getter:
Un getter es un método público que se utiliza para obtener el valor de un atributo privado de una clase.
Por lo general, su nombre sigue la convención de comenzar con "get" seguido del nombre del atributo. Por
ejemplo, si tienes un atributo nombre en una clase Persona, el getter correspondiente podría llamarse
getNombre(), y su función sería devolver el valor actual del atributo nombre.

Setter:
Un setter es un método público que se utiliza para establecer el valor de un atributo privado de una
clase. Su nombre suele seguir la convención de comenzar con "set" seguido del nombre del atributo.
Siguiendo el mismo ejemplo anterior, si deseas establecer el valor del atributo nombre, podrías usar un
método llamado setNombre(String nombre), donde nombre es el nuevo valor que deseas asignar al atributo.

Aquí tienes un ejemplo básico de cómo se ven los getters y setters en una clase Java:

EJEMPLO:
---------------------------------------------------------------------------------------------------------
public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
----------------------------------------------------------------------------------------------------------

En este ejemplo, la clase Persona tiene dos atributos privados (nombre y edad) con sus respectivos
getters y setters. Esto permite acceder y modificar estos atributos de manera controlada desde fuera
de la clase.

     */
}
