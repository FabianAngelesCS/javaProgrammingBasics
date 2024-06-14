package tarea19Abstraccion.ejercicio1;

public class Circulo implements Forma{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void getArea() {
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El radio del circulo es: " + area);
    }

    @Override
    public void getPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}
