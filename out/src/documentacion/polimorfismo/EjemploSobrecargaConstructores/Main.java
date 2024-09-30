package documentacion.polimorfismo.EjemploSobrecargaConstructores;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona1 = new Persona(29);
        Persona persona2 = new Persona("Fabian");
        Persona persona3 = new Persona("Li",2);

        System.out.println(persona.getNombre() + "--" + persona.getEdad());
        System.out.println(persona1.getNombre() + "--" + persona1.getEdad());
        System.out.println(persona2.getNombre() + "--" + persona2.getEdad());
        System.out.println(persona3.getNombre() + "--" + persona3.getEdad());
    }
}
