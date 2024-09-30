package documentacion.Encapsulacion;

public class subclaseCuentaDeBancoEjemplo extends EjemploGettersSettersCuentaDeBanco {

    public static void main(String[] args) {
        subclaseCuentaDeBancoEjemplo cuentaBanco = new subclaseCuentaDeBancoEjemplo();
        //obtenemos set para editar el dato
        cuentaBanco.setBalance(500);

        //obtenemos get para visualizar el dato:
        System.out.println(cuentaBanco.getBalance());


    }
}
