package Lesson7.Classes.model.Tests;

public class Test {
    public static void main(String[] args) {
        byte b = 5;
        int i = -129;
        b = (byte) i;
        System.out.println(b);
        i = i + 1;
        System.out.println(i);
        b = (byte) (b + 1);
        System.out.println(b);
        b++;
        System.out.println(b);
        b += 1;
        System.out.println(b);
        System.out.println(b + 1 + "Number");
        System.out.println("Number" + b + 1);

        String s = "7";
        System.out.println(s + 7);
        int x = Integer.parseInt(s);
        System.out.println(x + 7);
        String s1 = "4.8";
        double x1 = Double.parseDouble(s1);
        System.out.println(x1 + 0.2);
        String ss = b + " ";
        System.out.println(ss);

    }
}
