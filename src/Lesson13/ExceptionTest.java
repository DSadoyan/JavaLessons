package Lesson13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
    public static void main(String[] args) {
//        int x = 3, y = 0;
//        System.out.println(x / y);

//        String s = null;
//        System.out.println(s.length());

//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(array[6]);
        try {
            FileReader fileReader = new FileReader("ip.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ok");
        }
        System.out.println("go");

        try {
            int x = 3, y = 0;
            System.out.println(x / y);
            String s = null;
            System.out.println(s.length());
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[10]);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("good ");
        } catch (Exception e) {
            System.out.println("good e");
        } finally {
            System.out.println("finally");
        }
    }
}
