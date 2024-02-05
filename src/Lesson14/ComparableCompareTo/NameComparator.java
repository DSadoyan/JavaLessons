package Lesson14.ComparableCompareTo;

import java.util.Comparator;

public class NameComparator implements Comparator<Human> {

    @Override
    public int compare(Human h1, Human h2) {
        return h1.getName().compareTo(h2.getName());
    }
}
