package org.example.behavioral.visitor;

public class Cashier implements Visitor {

    private double totalCost;

    @Override
    public void visit(Rice rice) {
        totalCost += rice.getWeight() * rice.getPrice();
    }

    @Override
    public void visit(Pizza pizza) {
        totalCost += pizza.getPrice();
    }

    @Override
    public void visit(Meat meat) {
        totalCost += meat.getWeight() * meat.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
}
