public class BoolDemo {
    public static void main(String[] args) {
        boolen b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);
        // переменная логического типа может стоять
        //  условии оператора if
        if (b) System.out.println("Как вы думаете, увидите ли вы эту строку?");

        // операторы сравнения возвращают логическое значение
        System.out.println("Как вы думаете, увидите ли вы эту строку?");
    } // main (String[] args)

    } // BoolDemo class
}
