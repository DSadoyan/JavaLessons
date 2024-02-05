package Lesson7.Classes.model;

public class Car {
    private String model;
    private int year;

    public Car() {
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void f() {
        System.out.println("go");
    }

    public void f(int i) {
        System.out.println("going" + i);
    }
}
