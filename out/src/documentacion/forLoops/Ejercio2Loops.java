package documentacion.forLoops;

import java.util.Scanner;

public class Ejercio2Loops {

    static void sumaNumeros(){

        System.out.println("Ingresa un numero si hare la suma de todos los numeros anteriores a este: ");
        Scanner respuesta = new Scanner(System.in);
        int numero = respuesta.nextInt();

        if (numero < 0) {
            System.out.println("El numero debe ser mayor que 0");
            return;
        }

        int suma = 0;
        for (int i = 1; i <= numero; i++){
            suma +=i;
        }
        System.out.println("La suma de los numeros anteriores a "+numero+" es: "+suma);
    }

    public static void main(String[] args) {
        sumaNumeros();
    }
}
