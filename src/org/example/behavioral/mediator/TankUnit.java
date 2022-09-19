package org.example.behavioral.mediator;

public class TankUnit implements ArmedUnit {

    private final Commander commander;

    public TankUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("Tank unit is attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("Tank unit cannot attack now.");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("Tank unit stopped attacking...");
        commander.setAttackStatus(true);
    }
}
