package Lesson7.Classes.model;

public class Teacher extends Human{
        private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(salary);
    }
}