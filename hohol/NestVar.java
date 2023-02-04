public class NestVar {
    public static void main(String[] args) {
        int count=1;
        System.out.println("count = " + count);
        {
            // ошибка: переменная count уже объявлена.
            // Закоментируйте следующую строку
            int count = 2;
            System.out.println("Первый независимый блок: count = " + count);
            int n = 3;
            System.out.println("Первый независимый блок: n = " + n);
        }
        {
        int n=5;
    }