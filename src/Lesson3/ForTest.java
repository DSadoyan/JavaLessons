package Lesson3;

public class ForTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Java");
        }
        System.out.println("----------------");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");
        String[] names = {"Ani", "Gor", "Anna", "Aram", "Armen"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                System.out.println(names[i]);

            }
        }
        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 0) {
                System.out.println(names[i]);
            }
        }
        System.out.println("------------------");
        for (int i = names.length - 1; i >= 0 ; i--) {
            System.out.print(names[i] + " ");
        }
    }
}
