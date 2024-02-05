package Lesson11;

import Lesson11.abstraction.BassGuitarist;
import Lesson11.abstraction.ClassicalGuitarist;
import Lesson11.abstraction.Guitarist;

public class PolymorphismTest {
    public static void main(String[] args) {
        Guitarist g = new BassGuitarist();
        g.playMusic();
        g = new ClassicalGuitarist();
        g.playMusic();

    }
}
