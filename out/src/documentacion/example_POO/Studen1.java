package documentacion.example_POO;

public class Studen1 {

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Fabian";
        student.age = 29;
        student.feeding();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.feeding());

    }
}
