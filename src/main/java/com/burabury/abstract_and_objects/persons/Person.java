package com.burabury.abstract_and_objects.persons;

import com.burabury.abstract_and_objects.vehicles.Payable;
import com.burabury.abstract_and_objects.vehicles.Vehicle;

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
