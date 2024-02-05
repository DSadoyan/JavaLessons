package Lesson16;

public class Student {
    private String name;
    private String surname;
    private double mark;

    {
        name = "Gor";
    }

    {
        surname = "Goroyan";
    }

    {
        mark = 60.5;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name + " " + student.surname + " " + student.mark);
    }
}
