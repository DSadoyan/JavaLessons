package Lesson18.Java78;

public class Student {
    private String name;
    private String surname;
    private int birthday;
    private double mark;

    public Student(String name, String surname, int birthday, double mark) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + birthday + " " + mark;
    }

    public String fullName() {
        return name + " " + surname;
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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
