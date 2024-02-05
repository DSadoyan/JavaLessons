package Lesson7.Classes.model.Tests;

import Lesson7.Classes.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Gor");
        student.setSurname("Goroyan");
        student.setAge(25);
        System.out.println(student.getName() + " " + student.getSurname() + " " + student.getAge());
        Student s = new Student("Hayk", "Haykyan", 33);
        System.out.println(s.getName() + " " + s.getSurname() + " " + s.getAge());
        Student s1 = new Student("Ashot", "Ashotyan");
        System.out.println(s1.getName() + " " + s1.getSurname());
        Student s2 = new Student("Alla", 22);
        System.out.println(s2.getName() + " " + s2.getAge());
        s2.setName("Anna");
        System.out.println(s2.getName() + " " + s2.getAge());
        student.sum(4, 6);
        student.sum(4, 6, 5);
    }
}
