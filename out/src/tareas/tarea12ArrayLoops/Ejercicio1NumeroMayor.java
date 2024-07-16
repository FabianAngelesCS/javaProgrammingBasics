package tareas.tarea12ArrayLoops;

public class Ejercicio1NumeroMayor {

    static  void imprimirNumero(){

        int[] numeros = {10, 30, 40, 50, 150, 65, 89, 15};

        int numeroMayor = numeros[0];
        for (int numero : numeros){
            if (numeroMayor < numero)
                numeroMayor = numero;
        }
        System.out.println(" el numero mayor es: "+numeroMayor);
    }

    public static void main(String[] args) {
        imprimirNumero();
    }
}
