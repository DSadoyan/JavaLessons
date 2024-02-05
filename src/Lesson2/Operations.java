package Lesson2;

public class Operations {
    public static void main(String[] args) {
        int x = 1;
        int $x = 2;
        int _x = 3;
        System.out.println(x);
        System.out.println($x);
        System.out.println(_x);
        System.out.println(x + " " + $x + " " + _x);
        int x1 = 4;
        System.out.println(x1);

        String firstName = "a";
        String first_name = "b";
        System.out.println(firstName + " + " + first_name + " = c");

        float a = 1.0F, b = 2.0F;
        float c = a + b;
        float d = a - b;
        float e = a * b;
        float f = a / b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int i = 1, z = 2;
        System.out.println(i + z);
        System.out.println(i - z);
        System.out.println(i * z);
//        System.out.println(i / z);
//        System.out.println(i % z);
//        System.out.println(z / i);
//        System.out.println(z % i);

        double d1 = 10, d2 = 5;
        System.out.println(d1 + d2);
        System.out.println(d1 - d2);
        System.out.println(d1 * d2);
        System.out.println(d1 / d2);

        int ii = 10;
        ii++;
        System.out.println(ii);
        int iii = 10;
        --iii;
        System.out.println(iii);
//        boolean
        System.out.println(ii != 11);
        System.out.println(ii == 11);
        System.out.println(ii < 11);
        System.out.println(ii > 11);
        System.out.println(ii >= 11);
        System.out.println(ii <= 11);
        System.out.println(ii % 2 == 0);
        System.out.println(ii % 2 != 0);
        System.out.println();

        int xx = 5;
        System.out.println(xx >= 1 && xx <= 9);
        System.out.println(xx >= 0 || xx <= 10);
        System.out.println(xx != 5);

        boolean v = true;
        System.out.println(!v);

        System.out.println(5 & 8);
        System.out.println(5 | 8);
        System.out.println(5 ^ 8);


    }
}
