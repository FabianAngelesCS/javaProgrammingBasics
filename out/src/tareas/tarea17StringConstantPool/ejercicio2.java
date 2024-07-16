package tareas.tarea17StringConstantPool;
/*
Crea dos objetos de tipo String sin su constructor que contengan la misma cadena y compara los dos objetos utilizando
el método equals(). ¿Qué resultado se espera? ¿Por qué?
 */
public class ejercicio2 {

    public static void main(String[] args) {
        String oracion = "Ahora voy a realizar la comparacion con equals";
        String oracion1 = "Ahora voy a realizar la comparacion con equals";

        System.out.println(oracion1.equals(oracion));
        /*
        El resultado es TRUE, porque se esta realizando una comparacion del contenido de los objetos y es el mismo.
        El método equals() en la clase String está diseñado para comparar los valores reales de las cadenas y no las
        referencias.
         */
    }
}
