package com.condicionalesIfElse;

public class condicionalesOperadoresTernarios {

    public static void main(String[] args) {

        //SINTAXIS DE ESTE METODO: variable = condicion ? algunValor : otroValor;

        int precioBoleto = 2500;
        String mensaje = precioBoleto >= 3500 ? "Tienes acceso al palco VIP" : "No tienes acceso al palco VIP";
        System.out.println(mensaje);
    }
}
