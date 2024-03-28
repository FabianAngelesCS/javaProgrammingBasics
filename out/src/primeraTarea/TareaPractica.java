package primeraTarea;

public class TareaPractica {
    int age = 29;
    double altura = 1.70;
    String name = "Fabian Angeles Cruz Silva";
    double gravedad = 9.816;

    public static void main(String[] args) {
        TareaPractica futbolista = new TareaPractica();

        futbolista.name = "Lio Messi";
        futbolista.age = 36;
        futbolista.altura = 1.70;

        String generoMusica = "clasica";
        String mensaje = " me gusta el genero de musica, ";


        System.out.println("Hola me llamo " + futbolista.name +
                " y"+ mensaje + generoMusica);


    }
}
