package tareas.tarea20Excepciones.ejercicio2;

public class NumeroParImpar {

    public static void identificarNumero(int numero) throws ExcepcionNumeroInvalido{

        if (numero % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

    }
}
