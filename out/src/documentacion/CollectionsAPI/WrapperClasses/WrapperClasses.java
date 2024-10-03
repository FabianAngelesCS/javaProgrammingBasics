package documentacion.CollectionsAPI.WrapperClasses;

public class WrapperClasses {
/*
Las Wrapper Classes en Java son clases que proporcionan una forma de utilizar los tipos de datos primitivos como
objetos. Java es un lenguaje basado en objetos, pero algunos tipos de datos, como los enteros y los flotantes, no son
objetos, sino tipos primitivos (por ejemplo, int, double, char). Las clases envolventes (Wrapper Classes) permiten
tratar estos tipos primitivos como objetos, lo que es útil en ciertos contextos, como trabajar con colecciones o
utilizar métodos que requieren objetos en lugar de valores primitivos.

Wrapper Classes en Java:
Por cada tipo de dato primitivo, Java proporciona una clase envolvente correspondiente:

Tipo Primitivo	Clase Envolvente (Wrapper Class)
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean

Ejemplo:
int numero = 10;  // Tipo primitivo
Integer numeroObjeto = Integer.valueOf(numero);  // Wrapper Class
System.out.println(numeroObjeto);  // Imprime 10, pero el valor es tratado como un objeto

Características:
Autoboxing y Unboxing: Desde Java 5, el compilador puede convertir automáticamente un valor primitivo en su
correspondiente objeto de clase envolvente (esto se llama autoboxing) y viceversa (unboxing).

Ejemplo de autoboxing:
int numero = 10;
Integer numeroObjeto = numero;  // Autoboxing automático
Ejemplo de unboxing:

Integer numeroObjeto = 10;
int numero = numeroObjeto;  // Unboxing automático

Métodos útiles: Las clases envolventes proporcionan métodos útiles para trabajar con valores primitivos, como la
conversión de cadenas a números y viceversa, por ejemplo:

Integer.parseInt("123") convierte una cadena en un número entero.
Double.parseDouble("3.14") convierte una cadena en un número de punto flotante.
¿Cuándo usar Wrapper Classes?
Colecciones de Java: Las colecciones, como ArrayList, solo aceptan objetos, no tipos primitivos. Por ejemplo, no puedes
usar int directamente en un ArrayList, pero puedes usar Integer (la clase envolvente).


ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(10);  // Autoboxing convierte automáticamente el 10 en un objeto Integer

Métodos que requieren objetos: Algunos métodos requieren objetos en lugar de tipos primitivos. Por ejemplo, las clases
genéricas solo aceptan objetos, no tipos primitivos.
 */
}
