package tareas.tarea19Abstraccion.ejercicio1;

public class Rectangulo implements Forma{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void getArea() {
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }

    @Override
    public void getPerimetro() {
        double perimetro =  (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);

    }
}
