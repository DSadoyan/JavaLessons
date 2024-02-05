package Lesson8;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
        student.setMark(97.4);
        System.out.println(student.getMark());
        Human human = new Human("Hayk","Haykyan",28);
        System.out.println(human);
    }


}
