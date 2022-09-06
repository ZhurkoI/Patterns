package factory_method.factories;

import factory_method.Truck;
import factory_method.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
