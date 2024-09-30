package documentacion.polimorfismo.EjemploSustitucionMetodos;

public class Perro extends Animal {

    //Empleo del metodo overraide para sustituir el comportamiento de este mismo que fue
    // heredado desde la clase padre.
    @Override
    public void hacerSonido(){
        System.out.println("Grrrrrrrrrra gua gua!!");
    }
}
