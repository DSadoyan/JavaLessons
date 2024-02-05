package Lesson10.Tests;

public class DebugTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int x = 10;
        x++;
        System.out.print(x + " ");
        System.out.println();

        Human human = new Human();
        human.setName("Gor");
        human.setAge(25);
        System.out.println(human.getName() + " " + human.getAge());
    }
}
