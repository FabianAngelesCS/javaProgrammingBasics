package tareas.tarea13ForEach;

public class Ejercicio2LetrasCinco {

    static void imprimir5letras(){

        String[] palabras = {"palabra", "hotel", "computadora", "teclado", "casitas", "raton"};

        for(String palabra : palabras){
            if (palabra.length() > 5)
                System.out.println(palabra);
        }
    }
    public static void main(String[] args) {
        imprimir5letras();
    }
}
