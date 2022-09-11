package org.example.structural.bridge;

public class InexperiencedDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Inexperienced driver is doing his job.");
    }
}
