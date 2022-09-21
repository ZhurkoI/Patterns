package org.example.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Visitable> items = new ArrayList<>();

    void addToCart(Visitable item) {
        items.add(item);
    }

    public double calculateTotal() {
        Cashier cashier = new Cashier();

        for (Visitable item : items) {
            item.accept(cashier);
        }

        return cashier.getTotalCost();
    }
}
