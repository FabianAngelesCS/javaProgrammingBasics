package tareas.tarea17StringConstantPool;
/*
Crea dos objetos de tipo String con su constructor que contengan la misma cadena y compara los dos objetos utilizando
el método equals().
¿Qué resultado se espera? ¿Por qué?
 */
public class ejercicio4 {

    public static void main(String[] args) {
        String oracion = new String("Ahora voy a comparar los objetos con equals, ambos tiene su constructor");
        String oracion1 = new String("Ahora voy a comparar los objetos con equals, ambos tiene su constructor");

        System.out.println(oracion.equals(oracion1));
        /*
        El resultado es TRUE, porque el contenido real de los objetos es igual.
        El método equals() compara el contenido de los objetos, no sus referencias.
         */
    }
}
