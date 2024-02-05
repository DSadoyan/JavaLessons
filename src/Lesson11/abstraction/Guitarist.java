package Lesson11.abstraction;

public abstract class Guitarist extends Musician {


    @Override
    public void readNotes(String notes) {
        System.out.println("Reading guitar notes");
    }
}
