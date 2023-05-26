package ru.vshp.listing3;

public class BasketDemo {
void pay(double money) {
    System.out.println("оплачено наличными: " + money);
}
void pay(String cardNum) {
    System.out.println("Оплачено по кредитной карте #" + cardNum);
}
void pay(String accountNum, String bankCode) {
    System.out.println("Переведено на счет #" + accountNum + "в банке " + bankCode);
}
}
class BasketDemo {
    public static void main(String[] args) {
        BasketDemo b1 = new BasketDemo();
        BasketDemo b2 = new BasketDemo();
        BasketDemo b3 = new BasketDemo();

        System.out.print("b1: ");
        b1.pay(1200.0);
        System.out.print("b2: ");
        b2.pay("123456789");
        System.out.print("b3: ");
        b3.pay("987654321", "5500");
    }
}
