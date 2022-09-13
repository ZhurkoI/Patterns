package org.example.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(factory.getVehicleByType("bus"));
        vehicles.add(factory.getVehicleByType("bus"));
        vehicles.add(factory.getVehicleByType("bus"));
        vehicles.add(factory.getVehicleByType("bus"));
        vehicles.add(factory.getVehicleByType("bus"));

        vehicles.add(factory.getVehicleByType("car"));
        vehicles.add(factory.getVehicleByType("car"));
        vehicles.add(factory.getVehicleByType("car"));

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
