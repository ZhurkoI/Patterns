package org.example.structural.bridge;

public class PassengerCar extends Vehicle {
    public PassengerCar(Driver driver) {
        super(driver);
    }

    @Override
    void driveVehicle() {
        System.out.println("Passenger car is driving...");
        driver.drive();
    }
}
