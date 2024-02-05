package Lesson16.Generic;

public class GenericTest {
    public static void main(String[] args) {
        Integer[] i = {1, 5, 9, 7, 3, 0};
        Double[] d = {2.4, 5.8, 7.3, 4.9, 0.5};
        print(i,d);
//        print(d);
        System.out.println(max(i));
        System.out.println(max(d));
    }
    static <T extends Comparable<T>> T max(T[] array){
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0){
                max = array[i];
            }
        }
        return max;
    }
    static <Esiminch> void print (Esiminch[] e,Esiminch[] es){
        for (Esiminch el : e){
            System.out.print(el + " ");
        }
        System.out.println();
        for (int i = es.length-1; i >=0 ; i--) {
            System.out.print(es[i] + " ");
        }
        System.out.println();
    }
}
