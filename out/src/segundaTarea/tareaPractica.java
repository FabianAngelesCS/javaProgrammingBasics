package segundaTarea;

public class tareaPractica {

    public static void main(String[] args) {

        //Division de numeros, uno debe ser flotante si se quiere resultado mas exato con decimales.
        float numeroPanes = 10;
        int numeroNiños = 3;
        System.out.println(numeroPanes/numeroNiños);

        //variable con numero ramdon divido entre 0
        //Esta division no es pósible y lanzara por consola una acepcion e interrumpira la ejecucion del programa.
        int manzanasBuenas = 30;
        System.out.println(manzanasBuenas / 2);

        //operador de incremento "++". a la izquierda aumental el valor antes de ser evaluada, a la derecha,
        // lo aumenta despues de ser evaluada.

        int numeroHelados = 5;
        int heladosCompradosHoy = ++numeroHelados;
        System.out.println(numeroHelados);
        System.out.println(heladosCompradosHoy);

        int numeroOportunidades = 10;
        int oportunidadesGanadas = numeroOportunidades++;

        System.out.println(oportunidadesGanadas);
        System.out.println(numeroOportunidades);

        //Ejemplo de operador relacionales.
        //fans de futbol americano y futbol a nivel mundial

        long fansFutbolAmericano = 3500_000_000L;
        long fansFutbol = 400_000_000L;
        System.out.println(fansFutbol == fansFutbolAmericano);


        // Ejemplo de operadores relacionales y uso de condicionales.
        // platillo mas costoso:

        int precioMoleCuniCuni = 700;
        int precioChilesNogada = 600;

        if (precioChilesNogada > precioMoleCuniCuni)
            System.out.println("El precio del platillo, chiles en nogada es mas caro");
        else System.out.println("El precio del platillo, mole de Cuni Cuni es mas caro");
    }
}
