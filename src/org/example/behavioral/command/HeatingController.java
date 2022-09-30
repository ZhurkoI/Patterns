package org.example.behavioral.command;

public class HeatingController {

    HeatingOnCommand heatingOn;
    HeatingOffCommand heatingOff;

    public HeatingController(HeatingOnCommand heatingOn, HeatingOffCommand heatingOff) {
        this.heatingOn = heatingOn;
        this.heatingOff = heatingOff;
    }

    public void turnOnHeating() {
        heatingOn.execute();
    }

    public void turnOffHeating() {
        heatingOff.execute();
    }
}
