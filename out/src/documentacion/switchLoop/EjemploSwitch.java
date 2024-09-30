package documentacion.switchLoop;

import java.util.Scanner;

public class EjemploSwitch {

    static void diasSemana(){

        System.out.println("Dame un numero del 1 - 7: ");
        Scanner respuesta = new Scanner(System.in);
        int numeroE = respuesta.nextInt();

        switch (numeroE){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("El numero es incorrecto");
                break;

        }
    }
    public static void main(String[] args) {
        diasSemana();
    }
}
