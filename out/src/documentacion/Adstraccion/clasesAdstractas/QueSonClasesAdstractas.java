package documentacion.Adstraccion.clasesAdstractas;

public class QueSonClasesAdstractas {
/*
Las clases abstractas en Java son clases que no pueden ser instanciadas directamente y están destinadas a ser
subclaseadas. Estas clases pueden contener métodos abstractos y concretos, permitiendo definir una estructura general
para otras clases derivadas.

Características de las Clases Abstractas

No se Pueden Instanciar:
No es posible crear instancias de una clase abstracta directamente. Solo se pueden crear instancias de sus subclases
concretas.

Métodos Abstractos y Concretos:
Una clase abstracta puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación).
Las subclases deben proporcionar implementaciones para los métodos abstractos.

Constructores:
Aunque no se pueden instanciar directamente, las clases abstractas pueden tener constructores, los cuales son invocados
cuando se crean instancias de sus subclases.

Sintaxis de las Clases Abstractas
------------------------------------------------------------------------------------------------------------------------
abstract class NombreDeClase {
    // Método abstracto (sin implementación)
    abstract void metodoAbstracto();

    // Método concreto (con implementación)
    void metodoConcreto() {
        System.out.println("Este es un método concreto");
    }
}
------------------------------------------------------------------------------------------------------------------------
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
Explicación del Ejemplo
Clase Abstracta Animal:
Contiene un método abstracto makeSound() sin implementación.
Contiene un método concreto breathe() con implementación.
Clase Dog:
Extiende Animal y proporciona la implementación del método abstracto makeSound().
Clase Main:

Crea una instancia de Dog y la asigna a una referencia de tipo Animal.
Llama a los métodos makeSound() y breathe() en la instancia Dog.

Beneficios de Usar Clases Abstractas

Reutilización de Código:
Las clases abstractas permiten definir métodos concretos que pueden ser reutilizados por todas las subclases.

Polimorfismo:
Facilitan la creación de un comportamiento polimórfico. Las subclases pueden ser tratadas como instancias de la clase
abstracta, lo que permite invocar métodos abstractos y concretos de manera uniforme.

Estructura Común:
Proveen una estructura común para las subclases, asegurando que todas las subclases implementen ciertos métodos
esenciales.

Diferencias Entre Clases Abstractas e Interfaces
Clases Abstractas:

Pueden contener métodos abstractos y concretos.
Pueden tener estados (atributos) y constructores.
Una clase puede extender solo una clase abstracta debido a la restricción de la herencia simple.

Interfaces:
Solo pueden contener métodos abstractos (hasta Java 7) y métodos con implementación por defecto (a partir de Java 8).
No pueden tener estados (atributos) antes de Java 8; a partir de Java 8, pueden tener atributos static y final.
Una clase puede implementar múltiples interfaces, permitiendo una forma de herencia múltiple.

Ejemplo Comparativo
Clase Abstracta:
------------------------------------------------------------------------------------------------------------------------
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}
Interface:

java
Copiar código
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}
------------------------------------------------------------------------------------------------------------------------
En resumen, las clases abstractas en Java son una herramienta poderosa para definir una estructura común y
comportamiento general para un grupo de clases relacionadas, promoviendo la reutilización de código y el diseño limpio
de software.
 */
}
