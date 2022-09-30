package org.example.behavioral.mediator;

public class CommanderImpl implements Commander {

    ArmedUnit soldierUnit;
    ArmedUnit tankUnit;
    boolean attackStatus = true;

    @Override
    public void registerUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldierUnit = soldierUnit;
        this.tankUnit = tankUnit;
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.attack();
    }

    @Override
    public void stopAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}
