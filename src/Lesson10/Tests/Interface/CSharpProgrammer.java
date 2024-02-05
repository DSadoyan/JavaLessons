package Lesson10.Tests.Interface;

public class CSharpProgrammer extends Human implements Programmer,ChessPlayer{
    @Override
    public void writeCode(String language) {
        System.out.println("Csharp writing code" + language);
    }

    @Override
    public String language() {
        return "Csharp";
    }

    @Override
    public void readCode() {
        System.out.println("Reading Csharp code");
    }

    @Override
    public void speakEnglish() {
        System.out.println("Not speak english");
    }

    @Override
    public void playChess() {
        System.out.println("Playing chess");
    }
}
