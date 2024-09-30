package documentacion.Encapsulacion;

public class EjemploGettersSettersCuentaDeBanco {

    private String titular;
    private double balance;

    //Getters
    public double getBalance() {
        return this.balance;
    }

    public String getTitular() {
        return this.titular;
    }

    //SETTERS

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
