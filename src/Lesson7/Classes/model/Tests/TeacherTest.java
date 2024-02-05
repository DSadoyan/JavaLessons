package Lesson7.Classes.model.Tests;

import Lesson7.Classes.model.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Anna");
        teacher.setSurname("Ananyan");
        teacher.setYear(1980);
        System.out.println(teacher.getName() + " " + teacher.getSurname() + " " + teacher.getYear());
        teacher.setSalary(1000);
        System.out.println(teacher.getSalary());
        teacher.setPhone(123456);
        System.out.println(teacher.getPhone());
        teacher.printInfo();
        teacher.printInfo();
    }
}
