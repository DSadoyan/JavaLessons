package Lesson4;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Create an array with number 1 - 11");
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//        System.out.println();
//        for (int el : array){
//            System.out.print(el + " ");
//        }
        System.out.println("\n create an array with even numbers from -10 to 10");
        int[] array1 = new int[11];
        int n = -10;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = n;
            n += 2;
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("\n Given an array: print count of odd elements");
        int[] array2 = {1, 5, 9, 7, 3, -4, -6, -5, 0, -9, 8, 0};
        for (int el : array2) {
            if (el % 2 != 0)
                System.out.print(el + " ");
        }
        System.out.println();
        for (int el1 : array2) {
            if (el1 % 2 == 0) {
                System.out.print(el1 + " ");
            }
        }
        System.out.println("\n Given an array : print elements from -10 to 5");
        for (int el2 : array2){
            if (el2 >= -10 && el2 <= 5)
                System.out.print(el2 + " ");

        }
        System.out.println("\n Given an array : print elements which can be divided 3 or 4");
        for (int e : array2){
            if (e % 3 == 0 || e % 4 == 0)
                System.out.print(e + " ");
        }
        
    }


}




