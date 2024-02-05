package Lesson10.Tests.Interface;

public class JavaProgrammer extends Human implements Programmer{
    @Override
    public void writeCode(String language) {
        System.out.println("Java writing code" + language);
    }

    @Override
    public String language() {
        return "Java";
    }

    @Override
    public void readCode() {
        System.out.println("Reading java code");
    }

    @Override
    public void speakEnglish() {
        System.out.println("Speaking english");
    }
}
