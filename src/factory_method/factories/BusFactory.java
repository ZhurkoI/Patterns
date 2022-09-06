package factory_method.factories;

import factory_method.Bus;
import factory_method.Vehicle;

public class BusFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
