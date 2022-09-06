package factory_method.factories;

import factory_method.Car;
import factory_method.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
