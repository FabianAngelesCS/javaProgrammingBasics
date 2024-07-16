package tareas.tarea12ArrayLoops;

public class Ejercicio2nombresLetraA {

    static void InicialA(){

        String[]  nombres = {"Fabian", "Thalia", "Liam", "Adriana", "Arquimedes", "Arcelia" };

        String iniciaA = "";

        for (String nombre : nombres){
            if (nombre.startsWith("A"))
                System.out.println(nombre);
        }
    }
    public static void main(String[] args) {
        InicialA();
    }
}
