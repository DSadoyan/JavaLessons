package Lesson8;

public class Student extends Human {
    private double mark;

    public Student() {
        super("Gor","Goroyan",25);

    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
