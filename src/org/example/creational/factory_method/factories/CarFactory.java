package org.example.creational.factory_method.factories;

import org.example.creational.factory_method.Car;
import org.example.creational.factory_method.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
