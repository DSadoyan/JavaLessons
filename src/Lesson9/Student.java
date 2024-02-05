package Lesson9;

public class Student {
    public String name;
    public String surname;
    public int year;

    public Student(String name) {
        this.name = name;
    }

    public void sum(int x, int y) {
        System.out.println(name);
        System.out.println(x + y);
    }

    public static void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }
}
