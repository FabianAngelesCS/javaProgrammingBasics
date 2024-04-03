package programacionOrientadaObjetos;

public class EjemploMetodoParametrizado {
    //Metodo parametrizado que suma la nomina de cuatro semanas para calcular el total mensual
    public static int nominaMensual(int nominasemana1, int nominasemana2, int nominasemana3, int nominasemana4){
        return nominasemana1 + nominasemana2 + nominasemana3 + nominasemana4;
    }

    public static void main(String[] args) {
        // Como ya defini el metodo con "static" no es necesario crear una instancia.

        //llamar al metodo "nominaMensual" con los cuatro argumentos (1960)
        int salario = nominaMensual(1960,1960,1961,1960);
        //impreiosn en consola de resultado.
        System.out.println("Mi salario mensual como programador es de: $" + salario + " pesos mexicanos");
    }
}
