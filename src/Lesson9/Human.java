package Lesson9;

public class Human {
    public String name;
    public String surname;
    public int age;

    public static int count = 0;

    public Human() {
        count++;
    }

    static int x;
    static int y;
    static int z;

    static {
        System.out.println("x & y & z");
        x = 10;
        y = 20;
        z = 50;
        System.out.println("Hello");
    }
}
