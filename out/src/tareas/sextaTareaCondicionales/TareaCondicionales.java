package tareas.sextaTareaCondicionales;
import java.util.Scanner;
public class TareaCondicionales {

    static void elNumeroES(){
        System.out.println("Ingresa un numero y te dire si es negativo, positivo o cero: ");
        Scanner respuesta = new Scanner(System.in);
        int elNumeroEs = Integer.parseInt(respuesta.nextLine());

        if (elNumeroEs > 0)
            System.out.println("El numero es positivo");
        else if (elNumeroEs == 0)
            System.out.println("El numero es igual a 0");

        else
            System.out.println("El numero es negativo");

    }
    public static void main(String[] args) {
        elNumeroES();

    }
}
