package org.example.behavioral.state;

public class MobilePhone {

    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        state.doAction();
    }

    public void acceptCall() {
        if (state instanceof BlockedState) {
            setState(new UnlockedState());
        }
        System.out.println("Accepting the call. Device is unlocked.");
    }

    public void finishCall() {
        if (state instanceof UnlockedState) {
            setState(new BlockedState());
        }
        System.out.println("Finishing the call. Device is locked.");
    }
}
