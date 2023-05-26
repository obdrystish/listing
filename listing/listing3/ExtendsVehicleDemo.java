package ru.vshp.listing3;

public class ExtendsVehicleDemo {

}
class Auto extends Vehicle {
    boolean sunroof;
}
public class ExtendsVehicleDemo {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        bmw.sunroof = true;

        System.out.println("Путь, пройденный за 1.5 часа: " + bmw.distance(1.5) + "км.");
        System.out.println("Max.скорость: " + bmw.getMaxSpeed() + "км/ч.");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }

}