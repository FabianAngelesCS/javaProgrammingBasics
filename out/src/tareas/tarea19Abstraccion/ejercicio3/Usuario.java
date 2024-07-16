package tareas.tarea19Abstraccion.ejercicio3;

public class Usuario implements Accesible{

    //Variable privada
    private String contrasena;

    //Constructos de clase
    public Usuario() {
        this.contrasena = contrasena;
    }

    //Métodos de interfaz
    @Override
    public String getContrasena() {
        return contrasena;

    }
    @Override
    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;

    }
}
