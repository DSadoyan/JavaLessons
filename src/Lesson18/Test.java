package Lesson18;

import Lesson18.Java78.C;
import Lesson18.Java78.Message;
import Lesson18.Java78.Musician;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Musician.whoAmI();
        Musician pianist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pianist.playMusic();

        Musician guitarist = () -> System.out.println("Playing guitar");

        guitarist.playMusic();

        Message sms = (x) -> System.out.println("Sending SMS : " + x);
        sms.sendMessage("Hello");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 9, 7, 3, 0, -2, -8, 4, 6));
        numbers.forEach(x -> System.out.print(x + " "));

        System.out.println();

        List<String> names = new ArrayList<>();
        names.add("Gor");
        names.add("Ani");
        names.add("Anna");
        names.add("Aram");

//        Stream<String> stream = names.stream();
//        Stream<String> s = stream.map(String::toUpperCase);
//        List<String> result = s.collect(Collectors.toList());
//        System.out.println(result);

        List<String> result = names.stream()
                .filter(el -> el.length() < 4)
                .map(C :: convert)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
