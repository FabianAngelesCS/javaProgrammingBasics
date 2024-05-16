package com.polimorfismo;

public class EjemploCalculadoraPolimorfismo {

    //Sobrecarga

    //Método para sumar dos números enteros
    public int sumar(int a, int b){
        return a + b;
    }

    //Método para suemar dos números decimales
    public double sumar(double a, double b){
        return a + b;
    }

    //Método para sumar dos números flotantes
    public float sumar(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        //Crear ina isntancia de la clase
        EjemploCalculadoraPolimorfismo calculadora = new EjemploCalculadoraPolimorfismo();

        //Llamar al método sumar() pero con diferentes parametros
        System.out.println(calculadora.sumar(5,8));
        System.out.println(calculadora.sumar(0.5,0.89));
        System.out.println(calculadora.sumar(89.8989898989889F,3.14161646411645488989F));

    }
}

