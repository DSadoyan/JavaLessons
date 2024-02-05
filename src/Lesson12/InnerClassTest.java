package Lesson12;

public class InnerClassTest {
    public static void main(String[] args) {


        Triangle triangle = new Triangle("T1", 1, 1, 1, 5, 4, 1);
        triangle.printPerimeter();
        Triangle.MyPoint t = triangle.new MyPoint(1,2);

    }
}
