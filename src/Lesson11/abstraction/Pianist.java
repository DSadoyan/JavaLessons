package Lesson11.abstraction;

import Lesson11.abstraction.Musician;

public class Pianist extends Musician {
    @Override
    public void playMusic() {
        System.out.println("Playing piano");
    }

    @Override
    public void readNotes(String notes) {
        System.out.println("Reading piano notes");
    }
}
