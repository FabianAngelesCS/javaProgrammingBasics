package tarea14PolimorfismoSobrecarga;

public class CuartoEjercicioTexto {

    public void contarLetras(String texto){

        int contador = 0;

        char[] letra = texto.toCharArray();

        for (char letras : letra){

            if (Character.isLetter(letras)){
                contador++;
            }
        }
        System.out.println("El numero de letras del texto es: " + contador);
    }

    public static void main(String[] args) {
        String texto = "los dias de mayo, soy muy calurosos";

        CuartoEjercicioTexto contadores = new CuartoEjercicioTexto();

        contadores.contarLetras(texto);
    }
}
