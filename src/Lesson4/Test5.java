package Lesson4;

public class Test5 {
    public static void main(String[] args) {
//  Gtnel ayn tiv@ vor@ chuni ir dublicat@
        System.out.println("Find element witch is alone");
        int[] array = {1, 5, 9, 4, 5, 1, 9};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);
        System.out.println();
//      x - i & y - i arjeqneri poxanakum
        int x = 5, y = 7;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " y = " + y);

    }
}
