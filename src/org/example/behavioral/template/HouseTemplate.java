package org.example.behavioral.template;

public abstract class HouseTemplate {

    public void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        setupInterior();
        buildPool();
    }

    public abstract void buildWalls();

    public abstract void setupInterior();

    public abstract void buildPool();

    private void buildFoundation() {
        System.out.println("Building generic foundation.");
    }

    private void buildRoof() {
        System.out.println("Building generic roof.");
    }
}
