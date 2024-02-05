package Lesson4;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Given an array : print count of even elements");
        int[] array = {1, 9, 5, 4, 6, 8, 2, -8, -3, -4, -5, -6};
        int count = 0;
        for (int a : array) {
            if (a % 2 == 0)
                count++;
        }
        System.out.println(count);
        System.out.println("\n Given an array : print count of odd elements");
        int countOf = 0;
        for (int a : array) {
            if (a % 2 != 0)
                countOf++;
        }
        System.out.println(countOf);
        System.out.println("\n Given an array : print sum of elements");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        System.out.println("\n Given an array : print sum of positive elements");
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum1 = sum1 + array[i];
            }
        }
        System.out.println(sum1);
        System.out.println("\n Given an array : print sum of non positive elements");
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum2 += array[i];
            }
        }
        System.out.println(sum2);
        System.out.println("\n Given an array : print multiplication of elements");
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            number = number * array[i];
        }
        System.out.println(number);
        System.out.println("\n Given an array : print multiplication of positive elements");
        int number1 = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                number1 = number1 * array[i];
            }
        }
        System.out.println(number1);
        System.out.println("\n Given an array : print multiplication of non positive elements");
        int number2 = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                number2 = number2 * array[i];
            }
        }
        System.out.println(number2);
    }
}
