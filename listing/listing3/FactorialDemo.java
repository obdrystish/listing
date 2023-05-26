package ru.vshp.listing3;

public class FactorialDemo {
    static long computel(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
    static long computeR(int n) {
        if (n == 1) return n;
        return computeR(n - 1) * n;
    }
}
public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println("Вычисление факториал в цикле:");
        for (int i = 1; i > 0; i--) {
            System.out.println(i + "! = " + FactorialDemo.computel(i));
        }
        System.out.println("Вычисление факториала рекурсивным методом:");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + FactorialDemo.computeR(r));
        }
    }

}