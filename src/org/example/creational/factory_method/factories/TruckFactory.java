package org.example.creational.factory_method.factories;

import org.example.creational.factory_method.Truck;
import org.example.creational.factory_method.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
