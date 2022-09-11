package org.example.structural.bridge;

public class Truck extends Vehicle {
    public Truck(Driver driver) {
        super(driver);
    }

    @Override
    void driveVehicle() {
        System.out.println("Truck is driving...");
        driver.drive();
    }
}
