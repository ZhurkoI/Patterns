package org.example.structural.composite;

public class SimpleOrder implements Order {

    private String name;
    private int price;

    public SimpleOrder(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int calculateCost() {
        return price;
    }
}
