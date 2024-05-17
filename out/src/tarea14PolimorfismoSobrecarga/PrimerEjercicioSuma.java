package tarea14PolimorfismoSobrecarga;

public class PrimerEjercicioSuma {


    public int suma(int x, int y){
        return x + y;
    }

    public int suma(int x, int y, int z){
        return x + y + z;
    }

    public static void main(String[] args) {
        PrimerEjercicioSuma suma = new PrimerEjercicioSuma();

        System.out.println(suma.suma(50,90));
        System.out.println(suma.suma(30,60,70));
    }
}
