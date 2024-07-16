package tareas.tarea14PolimorfismoSobrecarga;

public class CuartoEjercicioTexto {

    //método para contar las letras de una cadena de texto
    public void contarLetras(String texto){

        int contador = 0;
        //Convertitir la cadena a un array de caracteres
        char[] letra = texto.toCharArray();
        //Recorrer cada caracter
        for (char letras : letra){
            if (Character.isLetter(letras)){
                contador++;
            }
        }
        System.out.println("El numero de letras del texto es: " + contador);
    }
    //Método para sumar el total de caracteres de dos cadenas de texto.
    public void contarLetras(String texto, String texto2){
        int contador =0;
        String dosTextos = texto + texto2;

        char[] letras = dosTextos.toCharArray();
        for (char letra: letras ){
            if (Character.isLetter(letra)){
                contador++;
            }
        }
        System.out.println("El total de letras en las dos cadenas es: " + contador);
    }

    public static void main(String[] args) {
        //Definir las cadenas de texto que seran pasadas como parametros en los métodos
        String texto = "los dias de mayo, soy muy calurosos";
        String texto2 = "Ahora mismo, ya estoy saturado de información";

        CuartoEjercicioTexto contadores = new CuartoEjercicioTexto();
        //Llamar el método para contrar las letras de una cadena de texto.
        contadores.contarLetras(texto);
        //Llamar el método para contar las letras de dos cadenas de texto.
        contadores.contarLetras(texto,texto2);
    }
}
