package org.example.behavioral.command;

public class HeatingOffCommand implements Command {

    HeatingSystem heatingSystem;

    public HeatingOffCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.turnOff();
    }
}
