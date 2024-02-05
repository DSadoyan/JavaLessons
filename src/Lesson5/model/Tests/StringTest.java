package Lesson5.model.Tests;

public class StringTest {
    public static void main(String[] args) {
        String s = "Hello from lesson 5";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        int countOfL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'l')
                countOfL++;
        }
        System.out.println(countOfL);
        String st = s.toUpperCase();
        System.out.println(st);
        String str = s.toLowerCase();
        System.out.println(str);

    }
}
