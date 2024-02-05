package Lesson14.ComparableCompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Gor", 20));
        humans.add(new Human("Ani", 30));
        humans.add(new Human("Boris", 25));
        humans.add(new Human("Dasha", 35));
        System.out.println(humans);
        Collections.sort(humans);
        System.out.println(humans);
        Collections.sort(humans, Collections.reverseOrder());
        System.out.println(humans);

        System.out.println("---------------");

        List<Human> list = new ArrayList<>();
        list.add(new Human("Alla",18));
        list.add(new Human("Erik",28));
        list.add(new Human("Babken",27));
        list.add(new Human("Gor",23));

        Collections.sort(list,new NameComparator());
        System.out.println(list);
        Collections.sort(list,new NameComparator().reversed());
        System.out.println(list);
        Collections.sort(list,new AgeComparator());
        System.out.println(list);
        Collections.sort(list,new AgeComparator().reversed());
        System.out.println(list);
//        Collections.sort(list, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return 0;
//            }
//        });

    }
}
