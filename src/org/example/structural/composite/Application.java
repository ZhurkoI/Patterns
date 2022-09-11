package org.example.structural.composite;

public class Application {

    public static void main(String[] args) {

        Order simpleOrderA = new SimpleOrder("Umbrella", 5);
        Order simpleOrderB = new SimpleOrder("Pents", 30);
        Order simpleOrderC = new SimpleOrder("Jacket", 50);

        ComplexOrder complexOrder = new ComplexOrder();
        complexOrder.addSubOrder(simpleOrderB);
        complexOrder.addSubOrder(simpleOrderC);

        System.out.printf("Cost of simple order: %d%n", simpleOrderA.calculateCost());
        System.out.printf("Cost of complex order: %d", complexOrder.calculateCost());
    }
}
