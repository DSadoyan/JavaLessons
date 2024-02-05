package Lesson14.EqualsHashCode;

import java.util.HashSet;

public class EqualsTest {
    public static void main(String[] args) {
        Student s1 = new Student("Gor", 25);
        Student s2 = new Student("Gor", 25);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("----------");

        String a = "Aa";
        String b = "BB";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("----------");

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        System.out.println(students.contains(s1));
        students.add(s2);
        System.out.println(students.contains(s2));

        System.out.println("----------");

        String x = "Hello";
        String y = "Hello";
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }


}
