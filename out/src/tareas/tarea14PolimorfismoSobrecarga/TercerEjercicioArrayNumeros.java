package tareas.tarea14PolimorfismoSobrecarga;

public class TercerEjercicioArrayNumeros {

    //Método para sumar los elementios de un array
    public void sumarArray(int[] numeros){
        int sumaTotal = 0;

        for (int numero : numeros){
            sumaTotal += numero;
        }
        System.out.println("la suma total de los números es: " + sumaTotal);
    }

    //Método para sumar los elementos de dos array
    public void sumarArray(int[] numero, int[] numeros2){
        //verificar que los array tengan la misma longitud
        if (numero.length != numeros2.length){
            throw new IllegalArgumentException("Los arrays deben tener la misma longitud");
        }

        int[] sumaArrays = new int[numero.length];
        //sumar los elementos correspondientes de cada array
        for (int i = 0; i < numero.length; i++){
            sumaArrays[i] = numero[i] + numeros2[i];
        }

        //inmprimir el array resultante
        System.out.print("La suma de los números de los dos array es: ");
        for (int suma : sumaArrays) {
            System.out.print(suma + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numeros = {5, 7, 9, 7, 2, 3};

        int[] numeros2 = {5, 7, 9, 7, 2, 3};

        TercerEjercicioArrayNumeros total = new TercerEjercicioArrayNumeros();

        //Llmar al método para sumar un solo array
        total.sumarArray(numeros);
        //Llamar al método para sumar dos array
        total.sumarArray(numeros,numeros2);

    }

}
