package org.example.behavioral.strategy;

public class BlockedState implements State {

    @Override
    public void doAction() {
        System.out.println("Device is blocked.");
    }
}
