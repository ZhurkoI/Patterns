package org.example.behavioral.template;

public class RegularHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Construction of wood walls.");
    }

    @Override
    public void setupInterior() {
        System.out.println("Setting up cheap interior.");
    }

    @Override
    public void buildPool() {
        System.out.println("House w/o swimming pool.");
    }
}
