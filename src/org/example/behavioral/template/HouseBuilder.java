package org.example.behavioral.template;

public class HouseBuilder {

    public static void main(String[] args) {
        HouseTemplate regularHouse = new RegularHouse();
        HouseTemplate luxuriousHouse = new LuxuriousHouse();

        System.out.println("Construction of regular house:");
        regularHouse.buildHouse();

        System.out.println();

        System.out.println("Construction of luxurious house:");
        luxuriousHouse.buildHouse();
    }
}
