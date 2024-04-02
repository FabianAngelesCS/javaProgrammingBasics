package programacionOrientadaObjetos;

public class EjemploMetodo {

    //Metodo que deescribe la rutina en la manana
    void rutinaManana(){
        System.out.println("Me visto");
        System.out.println("Preparo almuerzo");
        System.out.println("Tomar almuerzo");
    }

    //Metodo que deescribe la rutina en la tarde
    void rutinaTarde(){
        System.out.println("Salir a caminar con mi hijo");
        System.out.println("Comer fruta");
        System.out.println("jugar con mi hijo");
    }

    //Metodo que deescribe la rutina en la noche
    void rutninaNoche(){
        System.out.println("Limpiar el piso de casa");
        System.out.println("Estudiar o ver alguna serie");
        System.out.println("Ducharme");
    }

    public static void main(String[] args) {
        //Creacion de una instancia de la clase EjemploMetodo
        EjemploMetodo rutina = new EjemploMetodo();

        //Llamada al metodo
        rutina.rutninaNoche();
        rutina.rutinaTarde();
        rutina.rutinaManana();
    }
}
