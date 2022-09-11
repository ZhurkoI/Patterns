package org.example.structural.bridge;

public class ApplicationRunner {
    public static void main(String[] args) {
        Vehicle truck = new Truck(new SkillfulDriver());
        truck.driveVehicle();
        System.out.println("==========================");

        Vehicle car = new PassengerCar(new InexperiencedDriver());
        car.driveVehicle();
        System.out.println("==========================");

        Vehicle tractor = new Tractor(new SkillfulDriver());
        tractor.driveVehicle();
    }
}
