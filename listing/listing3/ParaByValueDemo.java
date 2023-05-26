package ru.vshp.listing3;

public class ParaByValueDemo {
    void callByVal(int x, int y) {
        x = x + y;
        y = y + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
 class ParaByValueDemo {
    public static void main(String[] agrs) {
        int a = 2;
        int b = 3;

        ParaByValueDemo test = ParaByValueDemo();
        test.callByVal(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
 }