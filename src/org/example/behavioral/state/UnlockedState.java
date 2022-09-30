package org.example.behavioral.state;

public class UnlockedState implements State {

    @Override
    public void doAction() {
        System.out.println("Interaction with unlocked device.");
    }
}
