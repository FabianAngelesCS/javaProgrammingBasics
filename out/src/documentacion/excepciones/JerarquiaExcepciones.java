package documentacion.excepciones;

public class JerarquiaExcepciones {
/*
A continuación se describe la jerarquia de las excepciones
java.lang.Object
    └── java.lang.Throwable
        ├── java.lang.Error
        │   ├── java.lang.AssertionError
        │   ├── java.lang.ExceptionInInitializerError
        │   ├── java.lang.LinkageError
        │   │   ├── java.lang.ClassCircularityError
        │   │   ├── java.lang.ClassFormatError
        │   │   ├── java.lang.NoClassDefFoundError
        │   │   ├── java.lang.UnsupportedClassVersionError
        │   │   └── ... (otros errores de enlace)
        │   ├── java.lang.OutOfMemoryError
        │   ├── java.lang.StackOverflowError
        │   ├── java.lang.ThreadDeath
        │   └── java.lang.VirtualMachineError
        │       ├── java.lang.InternalError
        │       ├── java.lang.UnknownError
        │       └── ... (otros errores de la JVM)
        └── java.lang.Exception
            ├── java.lang.RuntimeException
            │   ├── java.lang.ArithmeticException
            │   ├── java.lang.ArrayIndexOutOfBoundsException
            │   ├── java.lang.ArrayStoreException
            │   ├── java.lang.ClassCastException
            │   ├── java.lang.IllegalArgumentException
            │   │   ├── java.lang.NumberFormatException
            │   ├── java.lang.IllegalMonitorStateException
            │   ├── java.lang.IllegalStateException
            │   │   ├── java.util.ConcurrentModificationException
            │   ├── java.lang.IllegalThreadStateException
            │   ├── java.lang.IndexOutOfBoundsException
            │   │   ├── java.lang.StringIndexOutOfBoundsException
            │   ├── java.lang.NegativeArraySizeException
            │   ├── java.lang.NullPointerException
            │   ├── java.lang.SecurityException
            │   ├── java.lang.UnsupportedOperationException
            │   └── ... (otras RuntimeExceptions)
            ├── java.io.IOException
            │   ├── java.io.CharConversionException
            │   ├── java.io.EOFException
            │   ├── java.io.FileNotFoundException
            │   ├── java.io.InterruptedIOException
            │   └── java.io.UTFDataFormatException
            ├── java.sql.SQLException
            ├── java.text.ParseException
            ├── java.lang.InterruptedException
            └── ... (otras excepciones verificadas)
 */
/*
Descripción de las Clases Principales.

Throwable:
Es la superclase de todas las excepciones y errores en Java.
Tiene dos subclases directas: Error y Exception.

Error:
    Indica problemas graves que una aplicación normalmente no debería intentar manejar.
    Ejemplos:
        OutOfMemoryError: Indica que la JVM se ha quedado sin memoria.
        StackOverflowError: Indica que se ha desbordado la pila.
        VirtualMachineError: Es la superclase de errores internos de la JVM.

Exception:
    Indica condiciones que una aplicación puede intentar manejar.
    Tiene dos subclases principales:
    RuntimeException:
        Excepciones no verificadas que representan errores de programación.
    Checked Exceptions:
        Excepciones verificadas que deben ser manejadas o declaradas en la cláusula throws.

Detalles de las Clases de Excepción

RuntimeException
    ArithmeticException:
        Se lanza cuando ocurre una excepción aritmética, como dividir por cero.
    ArrayIndexOutOfBoundsException:
        Se lanza cuando se intenta acceder a un índice de matriz fuera del rango.
    ClassCastException:
        Se lanza cuando se intenta convertir un objeto a una subclase de la que no es una instancia.
    IllegalArgumentException:
        Se lanza cuando se pasa un argumento ilegal o inapropiado a un método.
    NullPointerException
        :Se lanza cuando se intenta utilizar una referencia de objeto que es null.

IOException:
    FileNotFoundException:
        Se lanza cuando un intento de abrir el archivo denotado por un nombre de ruta especificado ha fallado.
    EOFException:
        Se lanza cuando se alcanza inesperadamente el final del archivo o flujo de entrada.
    InterruptedIOException:
        Se lanza cuando una operación de E/S se interrumpe.
SQLException
    Indica un error relacionado con la base de datos.
ParseException
    Indica un error en el análisis de una cadena de texto.
Ejemplos de Uso
Manejo de RuntimeException (No verificada):

java
Copiar código
public class EjemploRuntimeException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }
}
Manejo de Checked Exception (Verificada):

java
Copiar código
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EjemploCheckedException {
    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
        }
    }
}
Esta estructura de excepciones en Java permite a los desarrolladores manejar diferentes tipos de errores de manera clara y estructurada, mejorando la robustez y la mantenibilidad del código.







 */
}
