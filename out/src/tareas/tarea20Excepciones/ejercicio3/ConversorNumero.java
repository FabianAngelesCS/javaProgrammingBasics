package tareas.tarea20Excepciones.ejercicio3;

import java.util.HashMap;
import java.util.Map;

public class ConversorNumero {

    private static final Map<String, Integer> numeroMap;

    static {
        numeroMap = new HashMap<>();
        numeroMap.put("uno", 1);
        numeroMap.put("dos", 2);
        numeroMap.put("tres", 3);
        numeroMap.put("cuatro", 4);
        numeroMap.put("cinco", 5);
        numeroMap.put("seis", 6);
        numeroMap.put("siete", 7);
        numeroMap.put("ocho", 8);
        numeroMap.put("nueve", 9);
        numeroMap.put("niez", 10);
    }

    public static int convertirNumero(String nombre) throws ExcepcionNoConversion {

        Integer numero = numeroMap.get(nombre.toLowerCase());
        if (numero == null) {
            throw new ExcepcionNoConversion("El nombre de numero ingresado no es valido");
        }
        return numero;
    }
}
