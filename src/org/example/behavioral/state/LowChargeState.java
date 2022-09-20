package org.example.behavioral.state;

public class LowChargeState implements State {

    @Override
    public void doAction() {
        System.out.println("Low charge. Please connect charger.");
    }
}
