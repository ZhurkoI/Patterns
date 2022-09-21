package org.example.behavioral.visitor;

public class Meat implements Visitable {

    private final double price;
    private final double weight;

    public Meat(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
