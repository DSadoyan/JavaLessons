package Lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gor", "Ani", "Alla", "Anna", "Jora", "Babken"));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);
    }
}
