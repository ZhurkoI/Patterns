package org.example.behavioral.mediator;

public class SoldierUnit implements ArmedUnit {

    private final Commander commander;

    public SoldierUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("Soldier unit is attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("Soldier unit cannot attack now.");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("Soldier unit stopped attacking...");
        commander.setAttackStatus(true);
    }
}
