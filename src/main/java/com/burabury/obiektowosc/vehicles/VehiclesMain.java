package com.burabury.obiektowosc.vehicles;

public class VehiclesMain {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.pay(-20);


        Train train = new Train();
        train.drive();
        train.pay(30);

        Car car = new Car();
        car.drive();
    }
}
