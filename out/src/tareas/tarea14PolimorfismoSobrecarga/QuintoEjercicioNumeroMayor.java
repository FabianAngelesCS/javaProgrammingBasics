package tareas.tarea14PolimorfismoSobrecarga;

public class QuintoEjercicioNumeroMayor {

    //Método para encontar el mayor de dos números
    public void numeroMayor(int numero, int numero2){

        if (numero < numero2){
            System.out.println("El número mayor es: " + numero2);
        } else if (numero > numero2) {
            System.out.println("El número mayor es: " + numero);
        }else {
            System.out.println(" los números son iguales");
        }
    }

    //Método para encontar el mayor de tres números
    public void numeroMayor(int numero, int numero2, int numero3){

        int mayor = numero;

        if (numero2 > mayor){
            mayor = numero2;
        }
        if (numero3 > mayor){
            mayor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);
    }

    public static void main(String[] args) {
        QuintoEjercicioNumeroMayor numeroMaximo = new QuintoEjercicioNumeroMayor();

        int numero = 6;
        int numero2 = 50;
        int numero3 = 150;

        //Llmar al método para encontar el mayor número de dos
        numeroMaximo.numeroMayor(numero, numero2);
        //Llmar al método para encontar el mayor número de dos
        numeroMaximo.numeroMayor(numero, numero2, numero3);

    }
}
