package org.example.creational.prototype;

public class HouseFactory {

    House house;

    public HouseFactory(House house) {
        this.house = house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    House cloneHouse() {
        return (House) house.clone();
    }
}
