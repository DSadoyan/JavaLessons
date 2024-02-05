package Lesson7.Classes.model;

public class Student {
    private String name;
    private String surname;
    private int age;

    public Student() {
        System.out.println("New Student");
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sum(int x,int y){
        System.out.println(x + y);
    }
    public void sum(int x,int y,int z){
        System.out.println(x + y + z);
    }

}
