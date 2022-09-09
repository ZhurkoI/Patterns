package org.example.creational.builder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new CityHouseBuilder());
        System.out.println("This is a house in the city: " + director.buildHouse());

        director.setBuilder(new CountryHouseBuilder());
        System.out.println("This is a house in the country: " + director.buildHouse());
    }
}
