package Lesson3;

public class IfTest {
    public static void main(String[] args) {
        int x = 4;
        if (x > 0) {
            System.out.println("Hello");
        }
        if (x < 5) {
            System.out.println("Java");
        }
        if (x >= 5)
            System.out.println("Hello");
        System.out.println("Java");

        int y = -1;
        if (y > 0)
            System.out.println("Positive");
        else System.out.println("Non Positive");


        int z = 5;
        if (z > 0) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        } else {
            System.out.println(4);
            System.out.println(5);
            System.out.println(6);
        }
        int i;
        if (x > 0)
            i = 1;
        else
            i = 0;
        System.out.println(i);

        i = x > 0 ? 1 : 0;
        System.out.println(i);

        int a = 20;
        int b = a > 5 ? 10 : 100;
        System.out.println(a);
        System.out.println(b);

        int j = -1;
        System.out.println(j > 0 ? "ok" : "no");
        System.out.println(j < 0 ? "last" : "first");

        int h = 0;
        if (h > 0) {
            System.out.println("Positive");
        } else {
            if (h < 0)
                System.out.println("Negative");
            else System.out.println("Zero");
        }
        int u = 0;
        System.out.println(u > 0 ? "positive" : u < 0 ? "negative": "zero");
    }
}
