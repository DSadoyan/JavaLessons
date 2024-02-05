package Lesson3;

public class ArraysTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a.length);
        System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);
        System.out.println(a[0] + a[a.length - 1]);


        String[] s = new String[8];
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(s[3]);
        System.out.println(s[4]);
        System.out.println(s[5]);
        System.out.println(s[6]);
        System.out.println(s[7]);

        int[] arr = {1, 5, 9, 7, 5, 3, 0, 2, 8, -1, -9, -3, -7, 0};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);

        String[] array;
        array = new String[]{"a", "b", "c", "d", "e", "f"};
        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array[array.length - 1]);

        int[] x;
        x = new int[]{1, 2, 3, 4, 5};
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        System.out.println(x.length);

    }
}
