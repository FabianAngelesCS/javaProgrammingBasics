package tarea11ArrayFoors;

public class Ejercicio3palabrafin {

    static void palabraFin(){

        String[] palabras = {"Hola", "mundo...", "esto", "es", "un", "programa", "fin", "adios"};

        for (String palabra : palabras){
            if (palabra.equals("fin")){
                break;
            }
            System.out.println(palabra);
        }
    }
    public static void main(String[] args) {
        palabraFin();
    }
}
