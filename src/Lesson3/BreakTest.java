package Lesson3;

public class BreakTest {
    public static void main(String[] args) {
        int[] arr = {-1, -9, 5, 0, -4, 6, 7, -3, 0};
        for (int el : arr) {
            if (el < 0) {
                System.out.println("Yes");
                break;
            }
        }
        for (int x : arr) {
            if (x == 0) {
                System.out.println("Ok");
                break;
            }
        }
        String[] array = {"a", "b", "c", "d", "e", "f", "a"};
        for (String s : array) {
            if (s == "a") {
                System.out.println("Good");
                break;
            }
        }
    }
}
