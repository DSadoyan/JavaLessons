package Lesson14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 5, 9, 7, 3, -4, 2, -6, 0, -8, 5));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for (Integer i : list){
            System.out.print(i + " ");
        }

        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.print(next + " ");
        }

        System.out.println();

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0){
//                list.remove(i);
//                i--;
//            }
//        }

        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 != 0){
//                list.remove(i);
//                i--;
//            }
//        }
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 != 0){
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
