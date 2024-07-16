package tareas.cuartaTareaMetodos;

public class TareaPractica {
    //Metodo para primer requerimiento: sumar dos cantidades enteras
    public static int sumarPeso(int pesoPersona1, int pesoPersona2){
        return pesoPersona1 + pesoPersona2;
    }
//----------------------------------------------------------------------------------------------------------------------
    //Metodo para segundo requerimiento: restar dos cantidades entereas.
    public static int sobranteSemanalGastos(int salario, int gastos){
        return salario - gastos;
    }
    //----------------------------------------------------------------------------------------------------------------------
    //Metodo para tercer requerimiento: multiplicar dos cantidades entereas.
    public static int gastoGasolina(int litrosGasolina, int precio){
        return litrosGasolina * precio;
    }
    //----------------------------------------------------------------------------------------------------------------------
    //Metodo para cuarto requerimiento: dividir dos cantidades.
    public static float dividirSalario(float salarioMensual, int numeropersonas){
        return salarioMensual / numeropersonas;
    }
    //----------------------------------------------------------------------------------------------------------------------
    //Metodo para quinto requerimiento: identificar numero mayor.
    public static int indentificarNumeroMayor(int numero1, int numero2){
            if (numero1 > numero2)
                return numero1;
            else
                return numero2;
    }

    public static void main(String[] args) {
        int pesoTotalPersonas = sumarPeso(85,53);
        System.out.println("La suma total del peso de la pareja de personas es de: " + pesoTotalPersonas + " kg.");
//----------------------------------------------------------------------------------------------------------------------
        int sobranteSemanal = sobranteSemanalGastos(1960,1700);
        System.out.println("Lo que me sobra a la semana despues de gastos es: $" + sobranteSemanal + " pesos");
//----------------------------------------------------------------------------------------------------------------------
        int gastoGasolinaMensual = gastoGasolina(20,25);
        System.out.println("Lo que gasto de gasolina al mes es: $" + gastoGasolinaMensual + " pesos");
//----------------------------------------------------------------------------------------------------------------------
        float divisionSalario = dividirSalario(8500,3);
        System.out.println("La cantidad de dinero que le toca a cada integrante de la familia es: $" + divisionSalario
                + " pesos");
//----------------------------------------------------------------------------------------------------------------------
        int numeroMayor = indentificarNumeroMayor(50,80);
        System.out.println("El numero mayor es: " + numeroMayor);


    }
}
