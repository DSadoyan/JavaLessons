package Lesson9;

public class StaticTest {
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        System.out.println(Human.count);
        System.out.println(Human.x);
        System.out.println(Human.y);
        System.out.println(Human.z);
        Student student = new Student("Mikael");
        student.sum(1, 2);
        student.sum(3, 4, 5);
        String s = "7";
        int i = Integer.parseInt(s);
        System.out.println(i);
        System.out.println(i + 3);
        char c = 'c';
        System.out.println(Character.isLetter(c));
        char ch = '3';
        System.out.println(Character.isLetter(ch));
        System.out.println("--------------------");
        String password = "AN012341@321";
        int count = 0;
        for (int j = 0; j < password.length(); j++) {
            if (Character.isUpperCase(password.charAt(j)))
                count++;
        }
        System.out.println(count);
        int countOfNumbers = 0;
        for (int j = 0; j < password.length(); j++) {
            if (Character.isDigit(password.charAt(j)))
                countOfNumbers++;
        }
        System.out.println(countOfNumbers);
        System.out.println("-----------------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
