package com.burabury.obiektowosc.persons;

import com.burabury.obiektowosc.vehicles.Payable;
import com.burabury.obiektowosc.vehicles.Vehicle;

public class Person {

    public Person() {
    }

    void driveBy(Vehicle vehicle) {
        vehicle.drive();
    }

    void buyTicketFor(Payable payable, int quantity) {
        payable.pay(quantity);
    }
}
