package org.example.behavioral.mediator;

public interface Commander {

    void registerUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit armedUnit);

    void stopAttack(ArmedUnit armedUnit);
}
