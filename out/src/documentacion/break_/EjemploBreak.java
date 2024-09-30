package documentacion.break_;

public class EjemploBreak {

    static void pararBucle(){
        //break empleado en un for loop
        for (int i = 0; i <= 100; i++){

            if (i == 70){
                System.out.println("Llegaste a 70, aqui nos detenemos");
                break;
            }
            System.out.println(i);
        }
        //break usado en un while loop
        int contador = 0;
        while (contador <= 100){
            if (contador == 70){
                System.out.println("llegaste a 70, aqui nos detenemos");
                break;
            }
            System.out.println(contador);
            contador++;
        }
    }
    public static void main(String[] args) {
        pararBucle();
    }
}
