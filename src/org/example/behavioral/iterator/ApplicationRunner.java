package org.example.behavioral.iterator;

public class ApplicationRunner {

    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("Audi", new String[]{
                "ABS", "cruise control", "conditioner", "seat heating"});

        MyIterator iterator = car.getIterator();
        System.out.println("Model is: " + car.getModel());
        System.out.println("Available options are:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
