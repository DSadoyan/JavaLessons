package Lesson4;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("Find maximum element of array");
        int[] array = {5, 3, 7, 2, 4, 8, 9, -2, -5, 0};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("maximum = " + max);
        System.out.println("Find minimum element of array");
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("minimum = " + min);
        System.out.println("Find count of element of array");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        System.out.println(count);
        for (int a : array)
            System.out.print(a + " ");
        System.out.println();
        System.out.println("\n Sort array 1");

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]){
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }for (int a : array)
            System.out.print(a + " ");
        System.out.println("\n Sort array 2");
        int temp1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]){
                    temp1 = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp1;
                }
            }
        }for (int a : array)
            System.out.print(a + " ");





    }
}
