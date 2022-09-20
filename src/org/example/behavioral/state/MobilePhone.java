package org.example.behavioral.state;

public class MobilePhone {

    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        state.doAction();
    }
}
