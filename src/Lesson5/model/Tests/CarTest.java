package Lesson5.model.Tests;

import Lesson5.model.models.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setEngine(4.8);
        car.setYear(2020);
        System.out.println(car.getModel() + " " + car.getYear());
        Car c = new Car();
        c.setEngine(3.2);
        System.out.println(c.getEngine());

    }
}
