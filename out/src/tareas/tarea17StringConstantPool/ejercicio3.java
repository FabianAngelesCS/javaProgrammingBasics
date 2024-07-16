package tareas.tarea17StringConstantPool;
/*
Crea dos objetos de tipo String con su constructor que contengan la misma cadena y compara los dos objetos utilizando
el operador ==.
¿Qué resultado se espera? ¿Por qué?
 */
public class ejercicio3 {
    public static void main(String[] args) {
        String texto = "Ahora comparare los objetos, pero uno tendra constructor";
        String texto1 = new String("Ahora comparare los objetos, pero uno tendra constructor");

        System.out.println(texto1 == texto);
        /*
        El resultado es FALSE; pues la referencia de los objetos está apuntando a distintos puntos de la memoria.
        El operador == compara las referencias de los objetos, no su contenido.
        */

    }
}
