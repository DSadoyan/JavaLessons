package Lesson8;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        scanner.nextLine();
        String string = scanner.nextLine();
        System.out.print(string);


    }
}
