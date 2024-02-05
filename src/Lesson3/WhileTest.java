package Lesson3;

public class WhileTest {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter++ + " ");
        }

        System.out.println();

        int number = 0;
        while (number <= 20) {
            System.out.print(number++ + " ");
        }

        System.out.println();

        int x = 1;
        while (x <= 4) {
            System.out.println("Hello");
            x++;
        }

    }
}
