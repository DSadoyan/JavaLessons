package Lesson13;

import java.util.Scanner;

public class ScannerTestException {
    public static void main(String[] args) {
        Human human = new Human();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        while (true) {
            String name = scanner.next();
            try {
                human.setName(name);
                System.out.println("Thanks " + human.getName());
                break;
            } catch (NameException e) {
                System.out.println("Invalid name");
            }

        }
    }
}
