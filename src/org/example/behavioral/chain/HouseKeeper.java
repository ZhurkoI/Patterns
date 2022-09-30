package org.example.behavioral.chain;

public abstract class HouseKeeper {

    private int costOfService;
    private HouseKeeper nextHouseKeeper;

    public HouseKeeper(int costOfService) {
        this.costOfService = costOfService;
    }

    public void setNextKeeper(HouseKeeper houseKeeper) {
        this.nextHouseKeeper = houseKeeper;
    }

    public void cleanHouse(String service, int availableMoney) {
        if (availableMoney >= costOfService) {
            doService(service);
        }
        if (nextHouseKeeper != null) {
            nextHouseKeeper.cleanHouse(service, availableMoney);
        }
    }

    public abstract void doService(String service);
}
