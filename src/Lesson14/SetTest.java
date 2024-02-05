package Lesson14;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(0);
        hashSet.add(-5);
        hashSet.add(-1);
        hashSet.add(5);
        hashSet.add(null);
        System.out.println(hashSet);

//        String[] names = {"Gor","Ani","Anna","Ani","Gor"};
//        HashSet<String> set = new HashSet<>();
//        for (String n : names){
//            set.add(n);
//        }
//        System.out.println(set);

        String[] names = {"Gor","Ani","Anna","Ani","Gor"};
        HashSet<String> set = new HashSet<>(Arrays.asList(names));
        System.out.println(set);

        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(0);
        treeSet.add(9);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(8);
        System.out.println(treeSet);

        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        tSet.add(10);
        tSet.add(15);
        tSet.add(1);
        tSet.add(11);
        tSet.add(7);
        System.out.println(tSet);

        String s = "Hello from Java Hello 2023 Lesson 2023";
        // Hello from Java 2023 Lesson
        String[] st = s.split(" ");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(st));
        System.out.println(linkedHashSet);
        for (String x : linkedHashSet){
            System.out.print(x + " ");
        }
    }
}
