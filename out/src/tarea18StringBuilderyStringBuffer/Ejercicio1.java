package tarea18StringBuilderyStringBuffer;
/*
Crea un pograma que tome un array de Strings y los concatene en una sola cadena de texto utilizando StringBuilder.
 */
public class Ejercicio1 {
    //Array de Strings
    String[] palabras = {"Hello", "wordl", "mira", "estoy", "concatenanado", "con", "StringBuilder"};

    //Método para concatenas array de Strings
    public String concatenarCadena(String[] palabras){
        //inicializar objeto de StringBuilder
        StringBuilder sb = new StringBuilder();

        for (String palabra: palabras){
            sb.append(palabra).append(" ");
        }
        //develve el resultado convertido en String
        return sb.toString();
    }

    public static void main(String[] args) {
        //Creacion de objero de la clase
        Ejercicio1 ejercicio1 = new Ejercicio1();
        //Declaracion de variabla con resultado.
        String resultado = ejercicio1.concatenarCadena(ejercicio1.palabras);
        //Impresión de resultado
        System.out.println(resultado);
    }
}
