package org.example.behavioral.visitor;

public class Pizza implements Visitable {

    private double price;

    public Pizza(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
