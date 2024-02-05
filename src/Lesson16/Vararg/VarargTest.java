package Lesson16.Vararg;

public class VarargTest {
    public static void main(String[] args) {
        sum(4);
        sum(14,0,7);
        sum();
        sum(new int[]{1,5,9,7,3,0});
    }
    static void sum(int... x){
        int s = 0;
        for (int a : x){
            s += a;
        }
        System.out.println(s);
    }
}
