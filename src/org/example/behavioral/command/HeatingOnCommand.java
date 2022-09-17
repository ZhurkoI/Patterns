package org.example.behavioral.command;

public class HeatingOnCommand implements Command {
    HeatingSystem heatingSystem;

    public HeatingOnCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.turnOn();
    }
}
