package tarea18StringBuilderyStringBuffer;
/*
Crea un programa que elimine todas las ocurrencias de un carácter específico en una cadena de texto utilizando
StringBuilder.
 */
public class Ejercicio2 {

    //Método para eliminar  un caracter de una cadena.
    public static void eliminarA(StringBuilder sb, char caracter){
        //Bucle para iterar sobre cada indice de la cadena
        for (int i = 0; i <sb.length(); i++){
            if (sb.charAt(i)==caracter){
                sb.deleteCharAt(i);
                //Despues de eliminar el caracter, se ajusta el indice.
                i--;
            }
        }
    }

    public static void main(String[] args) {
        //Declaracion de la cadena con Stringbuilder
        StringBuilder sb = new StringBuilder("Hola, mira estoy programando...No sabia esto hace dos años");

        //Llamar el método y proporcionar los paremtros.
        eliminarA(sb, 'a');
        //Impresion de datos resultantes.
        System.out.println(sb.toString());

    }
}
