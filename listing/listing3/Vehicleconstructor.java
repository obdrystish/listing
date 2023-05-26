package ru.vshp.listing3;

public class Vehicleconstructor {
}
class Vehicle {
    int passegers;
    private  int wheels;
    private  int maxspeed;
    int burnup;

    Vehicle() {
        this.passegers = 4;
        this.wheels = 4;
        this.maxspeed = 260;
        this.burnup = 13;
    }
    Vehicle(int passegers, int wheels, int maxspeed, int burnup) {
        this.passegers = passegers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
}

