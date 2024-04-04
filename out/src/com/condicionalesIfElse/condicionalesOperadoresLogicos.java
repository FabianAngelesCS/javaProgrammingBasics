package com.condicionalesIfElse;

public class condicionalesOperadoresLogicos {

    static void esPosistivo(int numero1, int numero2){
        if (numero1 > 0 && numero2 > 0)
            System.out.printf("Los numeros " + numero1 + " y " + numero2 + " son positivos");
        else if (numero1 > 0 && numero2 < 0)
            System.out.printf("El numero "+numero1+" es positivo y el numero "+numero2+" es negativo.");
        else if (numero1 < 0 && numero2 >0)
            System.out.printf("El numero "+numero1+" es negativo y el numero "+numero2+" es positivo.");
        else
            System.out.printf("Los numeros " + numero1 + " y " + numero2 + " son negativos");
    }

    public static void main(String[] args) {
        esPosistivo(-5,-50);
    }
}
