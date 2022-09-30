package org.example.behavioral.strategy;

public class UnlockedState implements State {

    @Override
    public void doAction() {
        System.out.println("Unlocked: Hello user!");
    }
}
