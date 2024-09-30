package tareas.tarea21MasExcepciones.ejercio3;

public abstract class Empleado {
    private String name;
    private String jobTitle;

    private int daysWorked;
    private int baseBonus;
    private int baseSalary;

    public Empleado(String name, String jobTitle, int daysWorked, int baseBonus, int baseSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.daysWorked = daysWorked;
        this.baseBonus = baseBonus;
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public int getBaseBonus() {
        return baseBonus;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public void setBaseBonus(int baseBonus) {
        this.baseBonus = baseBonus;
    }

    public abstract void calculateSalary() throws ArithmeticException;
    public abstract void calculateBonus() throws ArithmeticException;
}
