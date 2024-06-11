package com.Adstraccion;

public class QueEsAdstraccion {
/*
La abstracción en Java es uno de los principios fundamentales de la programación orientada a objetos (OOP). Permite a
los desarrolladores simplificar y gestionar la complejidad del código al ocultar los detalles de implementación y
mostrar solo la funcionalidad esencial de los objetos.

Conceptos Clave de la Abstracción en Java:

Ocultación de Detalles:
La abstracción oculta los detalles de implementación de una clase o un método y expone solo lo
necesario para el uso del objeto. Esto significa que el usuario de una clase no necesita saber cómo está implementada
por dentro, solo necesita saber cómo interactuar con ella a través de su interfaz pública.

Clases Abstractas y Métodos Abstractos:
En Java, la abstracción se implementa utilizando clases abstractas y métodos
abstractos. Una clase abstracta es una clase que no puede ser instanciada directamente y puede contener métodos
abstractos, que son métodos sin implementación. Las subclases de una clase abstracta deben proporcionar la
implementación de estos métodos abstractos.

Interfaces:
Las interfaces en Java también son una forma de lograr la abstracción. Una interfaz define un conjunto de
métodos que una clase debe implementar, sin proporcionar la implementación de esos métodos. Esto permite que diferentes
clases implementen la misma interfaz de diferentes maneras.

Ejemplo de Clase Abstracta
------------------------------------------------------------------------------------------------------------------------
abstract class Animal {
    // Método abstracto
    abstract void makeSound();

    // Método concreto
    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Dog extends Animal {
    // Implementación del método abstracto
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Salida: Woof Woof
        myDog.breathe();   // Salida: Animal is breathing
    }
}
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, Animal es una clase abstracta que define un método abstracto makeSound(). La clase Dog extiende Animal
y proporciona una implementación para el método makeSound(). Esto permite que Dog herede el método concreto breathe()
de Animal y también defina su propio comportamiento para makeSound().

Ejemplo de Interfaz
------------------------------------------------------------------------------------------------------------------------
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Bicycle implements Vehicle {
    public void start() {
        System.out.println("Bicycle is starting");
    }

    public void stop() {
        System.out.println("Bicycle is stopping");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bicycle();

        myCar.start(); // Salida: Car is starting
        myCar.stop();  // Salida: Car is stopping

        myBike.start(); // Salida: Bicycle is starting
        myBike.stop();  // Salida: Bicycle is stopping
    }
}
------------------------------------------------------------------------------------------------------------------------

En este ejemplo, Vehicle es una interfaz que define dos métodos: start() y stop(). Las clases Car y Bicycle implementan
la interfaz Vehicle y proporcionan su propia implementación para estos métodos.

Beneficios de la Abstracción
Reducción de la Complejidad: Al ocultar los detalles de implementación, la abstracción ayuda a reducir la complejidad
del código.
Facilidad de Mantenimiento: Las modificaciones en la implementación interna de una clase no afectan a otras partes del
código que utilizan esa clase.
Reusabilidad: La abstracción permite definir interfaces y clases abstractas que pueden ser reutilizadas por múltiples
clases.
Mejora de la Legibilidad: Al exponer solo lo necesario, el código se vuelve más legible y comprensible.

 */
}
