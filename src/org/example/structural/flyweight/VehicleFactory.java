package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static final Map<String, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicleByType(String vehicleType) {
        Vehicle vehicle = vehicles.get(vehicleType);

        if (vehicle == null) {
            switch (vehicleType) {
                case "car":
                    System.out.println("Creating Car object...");
                    vehicle = new Car();
                    break;
                case "bus":
                    System.out.println("Creating Bus object...");
                    vehicle = new Bus();
                    break;
                default:
                    throw new RuntimeException("The '" + vehicleType + "' type is unknown.");
            }
            vehicles.put(vehicleType, vehicle);
        }
        return vehicle;
    }
}
