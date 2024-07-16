package tareas.tarea16sobrecargaConstructores.Ejercicio3;

public class Empleado {
    //Declaración de variables
    private String name;
    private float salario;
    private String fechaContratacion;

    //Primer constructor con dos parametros
    public Empleado(String name, float salario) {
        this.name = name;
        this.salario = salario;
        this.fechaContratacion = "01-06-2024";
    }
    //Segundo paramtro con tres parametros
    public Empleado(String name, float salario, String fechaContratacion) {
        this.name = name;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}
