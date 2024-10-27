package documentacion.leccion4_queEsPrograma;
/*
Un **programa en Java** es un conjunto de instrucciones escritas en el lenguaje de programación Java que la computadora
puede ejecutar. Está compuesto por **clases**, **métodos** y otros elementos como variables y estructuras de control,
que trabajan juntos para realizar tareas específicas.

### Componentes clave de un programa en Java:

1. **Clases**: Java es un lenguaje orientado a objetos, lo que significa que todo el código se organiza dentro de
   clases. Cada archivo de código generalmente define una o más clases. Una clase puede contener métodos, atributos y
   constructores.
   Por ejemplo:

    `public class MiClase {     // Atributos y métodos van aquí }`

2. **Métodos**: Los métodos son bloques de código que realizan tareas específicas. El método más importante en un
   programa Java es el método `main`, que actúa como el punto de entrada donde comienza la ejecución:

    `public static void main(String[] args) {     // Código que se ejecutará al iniciar el programa }`

3. **Instrucciones**: Cada acción que la computadora debe realizar (como imprimir texto, realizar cálculos o manipular
   datos) se expresa mediante instrucciones. Estas se colocan dentro de los métodos, como:

    `System.out.println("Hola, Mundo!"); // Instrucción para imprimir en consola`

4. **Variables y tipos de datos**: Los programas almacenan y manipulan datos mediante variables, que tienen tipos como
   `int` (enteros), `double` (números decimales), `String` (cadenas de texto), entre otros. Ejemplo:

    `int numero = 5; // Declaración de una variable entera`

5. **Compilación y ejecución**: Un programa en Java debe ser compilado antes de ser ejecutado. El compilador transforma
   el código fuente (`.java`) en un archivo bytecode (`.class`), que luego es ejecutado por la Máquina Virtual de Java
   (JVM). El ciclo típico es:

    - **Escribir el código** en un archivo `.java`.
    - **Compilarlo** con `javac` para obtener un archivo `.class`.
    - **Ejecutarlo** con `java`, que corre el bytecode en la JVM.

### Ejemplo de un programa simple en Java:

`public class HolaMundo {     public static void main(String[] args) {
 System.out.println("¡Hola, Mundo!");
 } }`

Este programa define una clase llamada `HolaMundo` y dentro de la clase tiene un método `main` que imprime el mensaje "
¡Hola, Mundo!" en la consola.
*/
// Estructura basica deun programa

//DEfinicion de clase
public class QueEsUnPrograma {
    // Definicion de metodo principal, ee el primer metodo que se ejecutara al iniciar al programa
    public static void main(String[] args) {
        // Definicion de una variable.
        String mensaje = "Hola, este es el contenido de una variable";
        // Metodo para imprirmir mensaje por consoia.
        System.out.println(mensaje);
    }
}
