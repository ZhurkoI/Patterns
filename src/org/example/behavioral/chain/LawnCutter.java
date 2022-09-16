package org.example.behavioral.chain;

public class LawnCutter extends HouseKeeper {

    public LawnCutter(int costOfService) {
        super(costOfService);
    }

    @Override
    public void doService(String service) {
        System.out.println("Lawn cutting company works: " + service);
    }
}
