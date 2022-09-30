package org.example.structural.bridge;

public abstract class Vehicle {
    protected Driver driver;

    protected Vehicle(Driver driver) {
        this.driver = driver;
    }

    abstract void driveVehicle();
}
