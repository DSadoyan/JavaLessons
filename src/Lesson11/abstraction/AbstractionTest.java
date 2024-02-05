package Lesson11.abstraction;

public class AbstractionTest {
    public static void main(String[] args) {

        Pianist p = new Pianist();
        p.playMusic();
        BassGuitarist bg = new BassGuitarist();
        bg.playMusic();
        ClassicalGuitarist cg = new ClassicalGuitarist();
        cg.playMusic();
    }
}