package com.burabury.objects.vehicles;

public class Bus implements Vehicle, Payable {
    final double value = 3.2;

    @Override
    public void drive() {
        System.out.println("Driving by bus");
    }

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

}
