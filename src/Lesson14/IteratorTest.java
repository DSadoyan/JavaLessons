package Lesson14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 5, 9, 7, 3, -2, -8, 4, 6, 0, 5));
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Integer x = iterator.next();
//            if (x % 2 == 0)
//                iterator.remove();
//        }
//        System.out.println(list);
//
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            if (i % 2 != 0)
//                iterator.remove();
//        }
//        System.out.println(list);
        while (iterator.hasNext()){
            Integer y = iterator.next();
            System.out.print(y + " ");
        }
    }
}
