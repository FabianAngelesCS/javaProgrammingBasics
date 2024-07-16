package tareas.tarea16sobrecargaConstructores.Ejercicio1;

public class Main {
        public static void main(String[] args) {
            //Creacion de objetos de los costructores(sobrecarga, de mismo constructos con diferentes parametros)
             Estudiante estudiante = new Estudiante("Panfilo", 21);
             Estudiante estudiante1 = new Estudiante("Fabian", 29, "Programación");

             //Impresion de datos
            System.out.println(estudiante.getNombre() + "--" + estudiante.getEdad() + "--" + estudiante.getCarrera());
            System.out.println(estudiante1.getNombre() + "--" + estudiante1.getEdad() + "--" + estudiante1.getCarrera());

        }
}

