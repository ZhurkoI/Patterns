package factory_method;

public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bus is driving.");
    }
}
