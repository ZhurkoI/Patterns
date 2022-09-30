package org.example.behavioral.strategy;

public class MobilePhone {

    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        state.doAction();
    }
}
