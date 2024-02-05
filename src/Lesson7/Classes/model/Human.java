package Lesson7.Classes.model;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int phone;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printInfo(){
        System.out.println(name + " " + surname + " " + year + " " + phone);
    }
}
