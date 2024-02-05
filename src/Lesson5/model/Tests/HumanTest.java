package Lesson5.model.Tests;

import Lesson5.model.models.Human;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.firstName = "Aram";
        human.lastName = "Aramyan";
        human.year = 1996;
        human.isArmenian = true;
        human.gender = 'm';
        System.out.println(human.firstName + " " + human.lastName);
        Human human1 = new Human();
        human1.firstName = "Anna";
        human1.lastName = "Ananyan";
        human1.year = 2000;
        human1.isArmenian = true;
        human1.gender = 'f';
        System.out.println(human1.firstName + " " + human1.lastName);

        if (human.year < human1.year)
            System.out.println(human.firstName);
        else System.out.println(human1.firstName);

        System.out.println(human.year < human1.year ? human.firstName : human1.firstName);

        Human human2 = new Human();
        System.out.println(human2.year);
        human2.year = 1998;
        System.out.println(human2.year);

        human.sayHello();
        human1.sayHello();
        human2.sayHello();
        human.printFullName();
        human1.printFullName();
        human2.printFullName();
        System.out.println(human.fullName());
        String s = human1.fullName();
        System.out.println("Human1 full name is " + s);
        human2.sum(6, 4);
        human2.print1toN(5);
        System.out.println();
        System.out.println(human2.countOfPositives(new int[]{1, 5, 9, -7, -3}));


    }
}
