package tarea16sobrecargaConstructores.Ejercicio1;

public class Estudiante {
    //Declaración de variables privadas
   private String nombre;
   private int edad;
   private String carrera;

   //primer constructor con dos parametros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = "Ninguna";
    }
    //Segundo constructor con tres parametros
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    //Getters and setters de variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
