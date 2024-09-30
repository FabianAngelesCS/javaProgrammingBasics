package tareas.tarea21MasExcepciones.ejercio3;

public class Gerente extends Empleado{

    private int salary;
    private int bonus;

    public Gerente(String name, String jobTitle, int daysWorked, int baseBonus, int baseSalary) {
        super(name, jobTitle, daysWorked, baseBonus, baseSalary);
        this.salary = 0;
        this.bonus = 0;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() throws ArithmeticException {
        if (getDaysWorked() == 0){
            throw new ArithmeticException("ERROR EN calculateSalary: No se multiplicar por 0 dias");
        }
        if (getBaseSalary() == 0) {
            throw new ArithmeticException("ERROR EN calculateSalary: No se puede multiplicar por 0 base salary");
        }
        setSalary(getDaysWorked() * getBaseSalary());
    }

    @Override
    public void calculateBonus() throws ArithmeticException {
        if (getDaysWorked() == 0) {
            throw new ArithmeticException("ERROR EN calculateBonus: No se puede multiplicar por 0 dias");
        }
        if (getBaseBonus() == 0) {
            throw new ArithmeticException("ERROR EN calculateBonus: No se puede multiplicar por 0 base bonus");
        }
        setBonus(getDaysWorked() * getBaseBonus());
    }
}
