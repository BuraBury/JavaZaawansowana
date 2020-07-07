package com.burabury.objects.persons;

import com.burabury.objects.vehicles.Payable;
import com.burabury.objects.vehicles.Vehicle;

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
