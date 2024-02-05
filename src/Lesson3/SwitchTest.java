package Lesson3;

public class SwitchTest {
    public static void main(String[] args) {
        int x = 10;
        switch (x){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.println("not");
                System.out.println("--------------------");
            int y = 7;
            switch (y){
                case 1:
                case 3:
                case 5:
                    System.out.println("dasi chem");
                    break;
                case 2:
                case 4:
                case 6:
                    System.out.println("dasi em");
                    break;
                case 7:
                    System.out.println("kiraki");
                    break;
                default:
                    System.out.println("sxala");
            }
                System.out.println("--------------------");
            String s = "a";
            switch (s){
                case "not":
                    System.out.println("not");
                    break;
                case "good":
                    System.out.println("good");
                    break;
                case "no":
                    System.out.println("no");
                    break;
                case "like":
                    System.out.println("like");
                    break;
                case "yes":
                    System.out.println("yes");
                    break;
                default:
                    System.out.println("good luck");

            }
                System.out.println("--------------------");
            char c = 'c';
            switch (c){
                case 'a':
                    System.out.println("a");
                    break;
                case 'b':
                    System.out.println("b");
                    break;
                case 'c':
                    System.out.println("c");
                    break;
                case 'd':
                    System.out.println("d");
                    break;
                case 'e':
                    System.out.println("e");
                    break;
                case 'f':
                    System.out.println("f");
                    break;
                default:
                    System.out.println("no symbol");
            }
        }
    }

}
