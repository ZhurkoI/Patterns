package org.example.behavioral.template;

public class LuxuriousHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Construction of brick walls.");
    }

    @Override
    public void setupInterior() {
        System.out.println("Setting up luxurious interior.");
    }

    @Override
    public void buildPool() {
        System.out.println("Construction of swimming pool.");
    }
}
