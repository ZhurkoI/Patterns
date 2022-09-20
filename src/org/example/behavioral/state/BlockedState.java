package org.example.behavioral.state;

public class BlockedState implements State {

    @Override
    public void doAction() {
        System.out.println("Device is blocked.");
    }
}
