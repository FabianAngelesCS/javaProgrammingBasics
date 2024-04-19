package com.Encapsulacion;
//Definimos una subcalse que hereda los atributor de la super clase.
public class SubClaseHonda extends EjemploSuperClaseMoticicleta {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    //llmamaos a la super clase.
    public SubClaseHonda(String marca, int cilindraje, String modelo) {
        super(marca, cilindraje);
        this.modelo = modelo;
    }

}
