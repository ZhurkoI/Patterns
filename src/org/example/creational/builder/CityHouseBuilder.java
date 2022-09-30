package org.example.creational.builder;

public class CityHouseBuilder extends HouseBuilder {
    @Override
    void buildMaterial() {
        house.setMaterial(Material.BRICK);
    }

    @Override
    void buildSwimmingPool() {
        house.ifSwimmingPoolExists(false);
    }

    @Override
    void buildFrontYard() {
        house.ifFrontYardExists(false);
    }

    @Override
    void buildLocation() {
        house.setLocation(Location.CITY);
    }

    @Override
    void buildPrice() {
        house.setPrice(50_000);
    }
}
