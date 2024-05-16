package com.polimorfismo;

public class QueEsPolimorfismo {
    /*

El polimorfismo en Java es un concepto clave en la programación orientada a objetos que se refiere a la capacidad de
los objetos de una clase para tomar diferentes formas o comportarse de manera diferente según el contexto en el que se
utilicen.

Hay dos tipos principales de polimorfismo en Java:

Polimorfismo de tiempo de compilación (estático): También conocido como enlace estático o "sobrecarga" de método. Ocurre
cuando se tiene un método en una clase padre y se sobrescribe en una clase hija, pero se resuelve en tiempo de
compilación según el tipo de referencia de la variable.


Ejemplo:
------------------------------------------------------------------------------------------------------------------------

class Animal {
    void hacerSonido() {
        System.out.println("Haciendo un sonido genérico...");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Ladrando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro(); // Polimorfismo de tiempo de compilación
        miAnimal.hacerSonido(); // Llama al método hacerSonido() de la clase Perro
    }
}
------------------------------------------------------------------------------------------------------------------------

Polimorfismo de tiempo de ejecución (dinámico): También conocido como enlace dinámico o sobrescritura de método. Ocurre
cuando se invoca un método sobre un objeto y Java determina en tiempo de ejecución qué implementación del método llamar
según el tipo real del objeto.

Ejemplo:
------------------------------------------------------------------------------------------------------------------------

class Animal {
    void hacerSonido() {
        System.out.println("Haciendo un sonido genérico...");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Ladrando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); // Llama al método hacerSonido() de la clase Perro
    }
}
------------------------------------------------------------------------------------------------------------------------

El polimorfismo permite escribir código más genérico y flexible, ya que un objeto de una clase puede comportarse como
otro objeto de una clase relacionada, lo que facilita la reutilización del código y el diseño de programas más
modulares y mantenibles.

     */
}
