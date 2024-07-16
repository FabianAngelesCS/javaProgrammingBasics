package tareas.tarea19Abstraccion.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Forma circulo = new Circulo(10);

        circulo.getPerimetro();
        circulo.getArea();

        Forma rectangulo = new Rectangulo(10, 20);

        rectangulo.getArea();
        rectangulo.getPerimetro();

        Forma triangulo = new Triangulo(15, 15, 20,16);

        triangulo.getPerimetro();
        triangulo.getArea();
    }
}
