package org.example.creational.factory_method.factories;

import org.example.creational.factory_method.Bus;
import org.example.creational.factory_method.Vehicle;

public class BusFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
