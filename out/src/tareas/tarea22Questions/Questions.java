package tareas.tarea22Questions;
/*
Responde las siguientes preguntas:

1.- ¿Qué es la programación orientada a objetos?

Programación Orientada a Objetos (POO) es un paradigma de programación que organiza el software en torno a objetos.
Los objetos son instancias de clases, que actúan como plantillas o moldes. Cada objeto contiene atributos (también
llamados propiedades o variables) que describen su estado, y métodos, que definen el comportamiento del objeto o las
acciones que puede realizar.

2.- ¿Cuál es la diferencia entre una clase y un objeto en Java?
Una clase es una plantilla o modelo que define las propiedades y comportamientos (atributos y métodos) que los objetos
creados a partir de ella tendrán. Un objeto es una instancia de una clase, es decir, cuando creamos un objeto, estamos
creando una entidad específica basada en la estructura definida por la clase.

3.- ¿Cuáles son los 4 principios de la programación orientada a objetos?

Herencia:
"Es el mecanismo por el cual una clase (subclase o clase hija) puede heredar atributos y métodos de otra clase
(superclase o clase padre). Esto permite reutilizar código y extender funcionalidades sin necesidad de reescribirlas."

Encapsulación:
"Consiste en ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos
públicos. De esta manera, se controla el acceso a los datos, protegiéndolos de modificaciones indebidas, y se mejora la
modularidad."

Polimorfismo:
"Es la capacidad de los objetos de tomar diferentes formas. Permite que un objeto de una clase se comporte
de manera diferente según el contexto, ya sea sobrecargando métodos dentro de la misma clase o sobrescribiendo métodos
heredados de la clase padre."

Abstracción:
"Se refiere a simplificar la complejidad mostrando solo los aspectos esenciales del objeto y ocultando los
detalles innecesarios. En la abstracción, nos centramos en los aspectos importantes que definen al objeto desde un punto
de vista más general."

4.- ¿Cómo se manejan las excepciones en Java?
En Java, las excepciones se manejan utilizando una combinación de bloques y palabras clave que permiten capturar y
procesar los errores durante la ejecución del programa. Las más comunes son:

throw:
Se utiliza para lanzar manualmente una excepción. Por ejemplo, cuando deseas generar una excepción personalizada
o controlar explícitamente el flujo del programa en caso de error.
Ejemplo
throw new IllegalArgumentException("Parámetro no válido");

throws:
Se utiliza en la declaración de un método para indicar que puede lanzar una o más excepciones. Esto obliga a
quien llame al método a manejar la excepción o declarar que la lanza.
Ejemplo:
public void miMetodo() throws IOException {
    // Código que puede lanzar IOException
}

try:
Este bloque contiene el código "riesgoso", es decir, el código que puede generar una excepción. Si ocurre una excepción
dentro de este bloque, será capturada por el bloque catch correspondiente.
Ejemplo:
try {
    int resultado = 10 / 0;
}

catch:
Aquí se captura la excepción lanzada en el bloque try. Permite manejar la excepción y evitar que el programa se detenga
abruptamente. Puede haber varios bloques catch para manejar diferentes tipos de excepciones.
Ejemplo:
catch (ArithmeticException e) {
    System.out.println("Error: División por cero.");
}

finally:
Este bloque es opcional y se ejecuta siempre, independientemente de si ocurre o no una excepción. Es útil para liberar
recursos, cerrar conexiones, o realizar tareas de limpieza.
Ejemplo:
finally {
    System.out.println("Esto siempre se ejecuta.");
}

5.- ¿Cuál es la diferencia entre una interfaz y una clase abstracta en Java?

Clase abstracta:
- Una clase abstracta puede contener tanto métodos abstractos (sin implementación) como métodos concretos (con
 implementación).
- También puede definir variables de instancia y constructores (aunque no se pueden instanciar).
- Las clases abstractas permiten definir una estructura común y se utilizan cuando varias clases comparten una base común,
  pero tienen implementaciones personalizadas.
- Una clase puede heredar de una sola clase abstracta (ya que Java no soporta herencia múltiple).

Interfaz:
- Originalmente, las interfaces solo contenían métodos abstractos (sin implementación) y constantes, pero desde Java 8,
  las interfaces pueden tener métodos por defecto (con implementación) y métodos estáticos.
- A partir de Java 9, también pueden tener métodos privados con implementación para ser reutilizados dentro de la
  interfaz.
- Las interfaces se utilizan para definir un contrato que varias clases pueden implementar.
- Una clase puede implementar varias interfaces (esto permite un tipo de "herencia múltiple" en Java).

Principales diferencias:
- Las clases abstractas son más generales y permiten una estructura común con métodos y variables, mientras que las
  interfaces son más específicas para definir un comportamiento que múltiples clases pueden compartir.
- Una clase solo puede heredar de una clase abstracta, pero puede implementar múltiples interfaces.

6.- ¿Qué es la herencia múltiple y por qué no se permite en Java?
La herencia múltiple es un concepto en el que una clase puede heredar de más de una clase base. Es decir, una clase hija
tendría múltiples clases padre de las cuales podría heredar métodos y propiedades.

En Java, la herencia múltiple no se permite con clases para evitar problemas como la ambigüedad en los sistemas
extensos. Este tipo de ambigüedad ocurre cuando dos o más clases padre tienen el mismo método, y la clase hija no sabe
cuál de ellos heredar o utilizar. Este problema se conoce como el "problema del diamante".

 */
public class Questions {
}
