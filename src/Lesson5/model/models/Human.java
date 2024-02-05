package Lesson5.model.models;

public class Human {
    public String firstName;
    public String lastName;
    public int year = 2002;
    public boolean isArmenian;
    public char gender;

    public void sayHello() {
        System.out.println("Hello");
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    public void print1toN(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }

    public int countOfPositives(int[] array) {
        int count = 0;
        for (int x : array)
            if (x > 0)
                count++;
        return count;
    }

}
