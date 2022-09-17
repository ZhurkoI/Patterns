package org.example.behavioral.command;

public class ApplicationRunner {

    public static void main(String[] args) {
        HeatingSystem heatingSystem = new HeatingSystem();

        HeatingController controller = new HeatingController(
                new HeatingOnCommand(heatingSystem),
                new HeatingOffCommand(heatingSystem));

        controller.turnOnHeating();
        controller.turnOffHeating();
    }
}
