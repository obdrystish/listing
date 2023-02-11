public class CylinderVolume {
    public static void main(String[] args) {
        // эти переменные инициалиирузируются константами
        double radius = 4; // радиус цилиндра}
        double height = 5; // высота цилиндра

        // переменная volume инициализируются динамичски
        // вычисленным значением выражения
        double volume = 3.1416 * radius * height;
        System.out.println("Объем цилиндра равен" + volume);
    } // main(String[]} method
} // CylinderVolume class