package com.Encapsulacion;

import com.POOHerencia.Fabian;

public class SubclaseConstructorPersona {

    public static void main(String[] args) {

        EjemploConstructorPersona persona = new EjemploConstructorPersona("Fabian",29);
        // se puede imprimir el contenido de las varibles mediante los constructores.
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
    }
}
