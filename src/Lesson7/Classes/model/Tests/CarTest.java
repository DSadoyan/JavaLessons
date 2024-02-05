package Lesson7.Classes.model.Tests;

import Lesson7.Classes.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setYear(2023);
        System.out.println(car.getModel() + " " + car.getYear());
        Car car1 = new Car("BMW", 2022);
        System.out.println(car1.getModel() + " " + car1.getYear());
        Car car2 = new Car("Bmw");
        System.out.println(car2.getModel());
        Car car3 = new Car(2020);
        System.out.println(car3.getYear());
        car.f();
        car.f(5);
    }
}
