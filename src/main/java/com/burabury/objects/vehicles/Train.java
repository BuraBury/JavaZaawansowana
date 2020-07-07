package com.burabury.objects.vehicles;

public class Train implements Vehicle, Payable {
   final double value = 25.50;

    @Override
    public void pay(int quantity) {
        if (quantity < 5) {
            try {
                throw new ExceptionAtVehicle();
            } catch (ExceptionAtVehicle exceptionAtVehicle) {
                System.out.println(exceptionAtVehicle.message);
            }
        } else
            System.out.printf("%s $$%n", value * quantity);
    }

    @Override
    public void drive() {
        System.out.println("Driving by train");
    }
}
