package com.Encapsulacion;

public class MainSuperClase {
//podemos madar los datos devuletos de ejecutar el proceso para las super clase y subclase.
    public static void main(String[] args) {
        SubClaseHonda honda = new SubClaseHonda("Honda",125, "Twister");

        System.out.println(honda.getMarca());
        System.out.println(honda.getModelo());
        System.out.println(honda.getCilindraje());
    }
}
