package Lesson10.Tests;

public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialR(5));
    }

    public static int factorialR(int a) {
        if (a == 1 || a == 0)
            return 1;
        return a * factorialR(a - 1);
    }

    public static int factorial(int x) {
        int y = 1;
        for (int i = 1; i <= x; i++) {
            y = y * i;
        }
        return y;
    }
}
