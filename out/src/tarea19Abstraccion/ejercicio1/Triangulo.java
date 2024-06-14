package tarea19Abstraccion.ejercicio1;

public class Triangulo implements Forma{

    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea() {
        double area = base * altura / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    @Override
    public void getPerimetro() {
        double perimetro = base + altura + lado1 + lado2;
        System.out.println("El perimetro del triangulo es: " + perimetro);

    }
}
