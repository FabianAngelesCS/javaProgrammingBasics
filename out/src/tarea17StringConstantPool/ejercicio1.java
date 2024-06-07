package tarea17StringConstantPool;

/*
Crea dos objetos de tipo String sin su constructor que contengan la misma cadena y compara los dos objetos utilizando
el operador ==.
¿Qué resultado se espera? ¿Por qué?
 */
public class ejercicio1 {

    public static void main(String[] args) {

        // Crear dos variables de tipo String que contienen la misma cadena
        String texto = "Hola, mira estoy entendiendo String";
        String texto1 = "Hola, mira estoy entendiendo String";

        // Comparar los dos objetos String utilizando el operador ==
        System.out.println(texto1 == texto);
        /*
        El resultado es true, porque el contenido del objeto fue registrado como uno solo en el String Constant Pool.
        En Java, los literales de cadena se internan automáticamente en el String Constant Pool, lo que significa que
        las cadenas con el mismo contenido apuntarán a la misma referencia en la memoria.
         */

    }

}
