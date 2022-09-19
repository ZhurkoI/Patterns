package org.example.behavioral.mediator;

public class ApplicationRunner {

    public static void main(String[] args) {
        Commander commander = new CommanderImpl();
        ArmedUnit soldierUnit = new SoldierUnit(commander);
        ArmedUnit tankUnit = new TankUnit(commander);
        commander.registerUnits(soldierUnit, tankUnit);

        commander.startAttack(tankUnit);
        commander.startAttack(soldierUnit);
        commander.stopAttack(tankUnit);
        commander.startAttack(soldierUnit);
    }
}
