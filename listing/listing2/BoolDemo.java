package ru.vshp.listing2;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // переменная логического типа может стоять
        // в условии  if
        if (b) System.out.println(" Как вы думаете, увидите ли вы эту строку?");
        // операторы сравнениея возвращают логическое значение
        System.out.println("Выражение 10 > 9 имеет згачение " + (10 > 9));
    } // main(String[] args)
    } // BoolDemo class

}
