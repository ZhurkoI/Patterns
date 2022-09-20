package org.example.behavioral.strategy;

public class ApplicationRunner {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.setState(new UnlockedState());
        phone.doAction();

        phone.setState(new BlockedState());
        phone.doAction();

        phone.setState(new LowChargeState());
        phone.doAction();
    }
}
