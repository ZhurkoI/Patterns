package org.example.structural.bridge;

public class Tractor extends Vehicle {
    public Tractor(Driver driver) {
        super(driver);
    }

    @Override
    void driveVehicle() {
        System.out.println("Tractor is driving...");
        driver.drive();
    }
}
