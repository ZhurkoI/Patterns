package org.example.creational.factory_method;

import org.example.creational.factory_method.factories.BusFactory;
import org.example.creational.factory_method.factories.CarFactory;
import org.example.creational.factory_method.factories.TruckFactory;
import org.example.creational.factory_method.factories.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = createSpecificVehicle("truck");
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();
    }

    static VehicleFactory createSpecificVehicle(String name) {
        if (name.equalsIgnoreCase("car")) {
            return new CarFactory();
        } else if (name.equalsIgnoreCase("bus")) {
            return new BusFactory();
        } else if (name.equalsIgnoreCase("truck")) {
            return new TruckFactory();
        } else {
            throw new RuntimeException("Vehicle with type " + name + " cannot be created.");
        }
    }
}
