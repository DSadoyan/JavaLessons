package Lesson14;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
//        arrayList.remove(0);
        arrayList.remove(Integer.valueOf(5));
        arrayList.set(0, 5);
        System.out.println(arrayList.indexOf(9));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(7));
        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add(0, "AAA");
        linkedList.add(1, "BBB");
        linkedList.add(2, "CCC");
        linkedList.remove("CCC");
        linkedList.set(0, "CCC");
        System.out.println(linkedList.indexOf("BBB"));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains("BBB"));
        System.out.println(linkedList);

        System.out.println("---------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }

        System.out.println("---------------");

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 5, 9, 7, 3, -4, -6, -8, -2, 0));
        System.out.println(array);
        System.out.println(array.size());

        System.out.println("---------------");

        LinkedList<String> string = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        System.out.println(string);
        System.out.println(string.size());

        System.out.println("---------------");

        LinkedList<Integer> integerLinkedList = new LinkedList<>() {
            {
                add(1);
                add(3);
                add(0);
                add(-5);
            }
        };
        System.out.println(integerLinkedList);

        System.out.println("---------------");

        ArrayList<Integer> integerArrayList = new ArrayList<>(Collections.nCopies(10, 5));
        ArrayList<Integer> integer = new ArrayList<>(Collections.nCopies(5, 10));
        integerArrayList.addAll(integer);
        System.out.println(integerArrayList.size());
        System.out.println(integerArrayList);

        System.out.println("---------------");

        List<Integer> i = new ArrayList<>(Arrays.asList(1, 5, 9, 7, 5, 3, 0, -8, -2, -6, -4));
        Collections.sort(i);
        System.out.println(i);
        Collections.sort(i, Collections.reverseOrder());
        System.out.println(i);
    }

}
