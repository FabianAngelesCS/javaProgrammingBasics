package documentacion.Encapsulacion;

public class SuperClase {

    /*

----¿QUE ES UNA SUPER CLASE?----


La superclase en Java es la clase de la que una clase derivada (o subclase) hereda atributos y métodos. También se
conoce como clase base o clase padre. Cuando creas una nueva clase, puedes extenderla (o heredar de ella) utilizando
la palabra clave extends, lo que hace que la nueva clase sea una subclase de la clase extendida.

La superclase proporciona un conjunto de características comunes que son heredadas por todas sus subclases. Estas
características pueden incluir atributos, métodos y otros miembros de la clase. La subclase puede agregar nuevos
miembros, modificar los miembros heredados o incluso reemplazar los métodos heredados mediante la técnica de la
sobrescritura.

Por ejemplo, considera las clases Vehiculo y Coche:

EJEMPLO:
------------------------------------------------------------------------------------------------------------------------
public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, String modelo, int puertas) {
        super(marca, modelo); // Llama al constructor de la superclase
        this.puertas = puertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase
        System.out.println("Puertas: " + puertas);
    }
}
------------------------------------------------------------------------------------------------------------------------
En este ejemplo, la clase Coche es una subclase de la clase Vehiculo. Hereda los atributos marca y modelo, así como el
método mostrarDetalles() de la clase Vehiculo. La clase Coche también agrega un nuevo atributo puertas y sobrescribe el
método mostrarDetalles() para agregar información específica de los coches.
     */
}
