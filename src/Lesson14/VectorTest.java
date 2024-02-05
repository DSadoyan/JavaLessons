package Lesson14;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector<String> month = new Vector<>(12);
        month.add(0, "January");
        month.add(1, "February");
        month.add(2, "March");
        month.add(3, "April");
        month.add(4, "May");
        month.add(5, "June");
        month.add(6, "July");
        month.add(7, "August");
        month.add(8, "September");
        month.add(9, "October");
        month.add(10, "November");
        month.add(11, "December");

        System.out.println(month);
        System.out.println(month.size());
        System.out.println(month.capacity());

    }
}