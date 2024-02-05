package Lesson3;

public class ForeachTest {
    public static void main(String[] args) {
        String[] names = {"Ani", "Ashot", "Alla", "Artur", "Levon"};
        for (String s : names) {
            System.out.print(s + " ");
        }

        System.out.println();

        int[] array = {1, 5, 9, 7, 5, 3, 2, 8, 4, 6, 0, -1, -9, -7, -3, -5};
        for (int i : array){
            System.out.print(i + " ");
        }
    }


}

