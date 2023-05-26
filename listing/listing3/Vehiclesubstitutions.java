package ru.vshp.listing3;

public class Vehiclesubstitutions {
}
class Vehicle {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;
    Vehicle() {
    this(4, 4, 160, 13);
  }
  Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
     this.passengers = passengers;
     this.wheels = wheels;
     this.maxspeed = maxspeed;
     this.burnup = burnup;
  }
 double distanse(int interval) {
     return distanse((double) interval);
 }
double distance(double interval) {
     double value = this.maxspeed * interval;
     return value;
}
}
