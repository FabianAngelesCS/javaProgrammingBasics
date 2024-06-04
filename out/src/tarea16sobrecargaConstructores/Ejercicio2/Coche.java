package tarea16sobrecargaConstructores.Ejercicio2;

public class Coche {
    //Decalracionde variables privadas
   private String marca;
   private String modelo;
   private int año;

   //primer cosntrustor con dos parametros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = 2021;
    }

    //segundo constructor con tres parametros
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
