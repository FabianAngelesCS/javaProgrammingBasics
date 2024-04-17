package com.Encapsulacion;

public class ThisJava {

    /*
---uso de "This" eb java---

La palabra clave this en Java se refiere a la instancia actual de la clase en la que se encuentra.
Se utiliza para hacer referencia a los miembros de la clase (variables de instancia, métodos,
constructores) desde dentro de la propia clase.

this es útil en situaciones donde hay ambigüedad entre los nombres de los parámetros y los nombres de
las variables de instancia o métodos de la clase. Por ejemplo, considera el siguiente código:

Ejemplo:
---------------------------------------------------------------------------------------------------------
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
---------------------------------------------------------------------------------------------------------
En este ejemplo, this.nombre se utiliza para referirse a la variable de instancia nombre de la clase
Persona. Sin this, el código sería ambiguo ya que hay un parámetro y una variable de instancia con el
mismo nombre.

En resumen, this es una referencia a la instancia actual de la clase y se utiliza para diferenciar entre
variables de instancia y parámetros, así como para llamar a métodos y constructores de la propia clase.
     */


    //ejemplo practica

    private int numero;

    public void numeros(int numero){
        this.numero = numero;

    }

}
