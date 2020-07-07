package com.burabury.obiektowosc.persons;

import com.burabury.obiektowosc.vehicles.*;

public class Runner {

    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();

        person.driveBy(car);
        person.driveBy(bus);
        person.driveBy(train);

        person.buyTicketFor(bus, 100);
        person.buyTicketFor(train, 20);
        person.buyTicketFor(bus, 3);

    }
}
