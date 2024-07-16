package tareas.tarea10Switch;

import java.util.Scanner;

public class Ejercicio2Switch {

    static void conversioGrados(){

        System.out.println("¿En que escala esta esta la temperatura que deseas convertir? ");
        System.out.println("c = Celcius");
        System.out.println("f = Fahrenheit");
        Scanner respuesta = new Scanner(System.in);
        char escala = respuesta.next().charAt(0);
        System.out.println("Ingresa la temperatura para reaizar la conversion: ");
        int temperatura = respuesta.nextInt();;


        switch (escala){
            case 'c':
            case 'C':
                int convercionFahrenheit = temperatura*9/5+32;
                System.out.println("La temperatura convertida a Fahrenheit es: " + convercionFahrenheit + " grados" );
                break;
            case'f':
            case'F':
                int conversionCelcius = (temperatura-32)*5/9;
                System.out.println("La temperatura convertida a Celcius es: " + conversionCelcius + " grados");
                break;
            default:
                System.out.println("No has elegido una escala correta");
        }
    }
    public static void main(String[] args) {
        conversioGrados();
    }
}
