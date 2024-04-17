package tarea11ArrayFoors;

public class Ejercicio2DivididoCinco {

    static void numeroDividido(){

        int[] numeros = {12, 19, 29, 50, 89, 123};

        for(int numero : numeros){
            if (numero % 5 == 0){
                break;
            }
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        numeroDividido();
    }
}
