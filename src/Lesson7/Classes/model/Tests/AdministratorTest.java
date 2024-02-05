package Lesson7.Classes.model.Tests;

import Lesson7.Classes.model.Administrator;

public class AdministratorTest {
    public static void main(String[] args) {
        Administrator administrator = new Administrator();
        administrator.setName("Zara");
        administrator.setSurname("Zaryan");
        administrator.setYear(1990);
        System.out.println(administrator.getName() + " " + administrator.getSurname() + " " + administrator.getYear());
        administrator.setDepartment("Music");
        System.out.println(administrator.getDepartment());
        administrator.setPhone(987654);
        System.out.println(administrator.getPhone());
        administrator.printInfo();
        administrator.printInfo();
    }
}
