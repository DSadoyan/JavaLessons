package Lesson15.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "Gor");
        map.put(10, "Ani");
        map.put(6, "Anna");
        map.put(null, "Garik");
        map.put(17, "Karen");
        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.get(null));
        System.out.println("----------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> x : entries) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println("----------");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("----------");
        HashMap<Integer, MyLang> numbers = new HashMap<>();
        numbers.put(1, new MyLang("one", "մեկ", "один"));
        numbers.put(2, new MyLang("two", "երկուս", "два"));
        numbers.put(3, new MyLang("three", "երեք", "три"));
        numbers.put(4, new MyLang("four", "չորս", "четыре"));
        numbers.put(5, new MyLang("five", "հինգ", "пять"));
        int x = 1, y = 2;
        System.out.println(numbers.get(x).en + " + " + numbers.get(y).en + " = " + numbers.get(x + y).en);
        System.out.println(numbers.get(x).ru + " + " + numbers.get(y).ru + " = " + numbers.get(x + y).ru);
        System.out.println(numbers.get(x).hy + " + " + numbers.get(y).hy + " = " + numbers.get(x + y).hy);


    }
}
