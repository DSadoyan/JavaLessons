package Lesson13;

public class ExceptionMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Alla");
        System.out.println(human.getName());

        try {
            human.setYear(1000);
        } catch (YearException e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }

}
