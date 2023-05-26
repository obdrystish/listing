package ru.vshp.listing3;

class DivisionByZeroException {
    public String getMessage() {
        return "Деление на ноль запрещкно!";
    }
}
public class ExceptionDemo {
    private static void main(String[] args) {
        try {
            divide (8, 0);
        } catch (DivisionByZeroException dz) {
            System.out.println(dz.getMessage());
        }
    }
}
