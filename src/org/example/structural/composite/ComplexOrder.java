package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ComplexOrder implements Order {

    private final List<Order> orders = new ArrayList<>();

    public void addSubOrder(Order order) {
        orders.add(order);
    }

    public void removeSubOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public int calculateCost() {
        int cost = 0;
        for (Order order : orders) {
            cost += order.calculateCost();
        }
        return cost;
    }
}
