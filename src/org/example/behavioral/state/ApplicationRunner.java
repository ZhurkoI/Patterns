package org.example.behavioral.state;

public class ApplicationRunner {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.setState(new BlockedState());
        phone.doAction();

        phone.acceptCall();
        phone.doAction();
        phone.finishCall();

        phone.doAction();
    }
}
