package org.example.behavioral.chain;

public class PoolCleaner extends HouseKeeper {

    public PoolCleaner(int costOfService) {
        super(costOfService);
    }

    @Override
    public void doService(String service) {
        System.out.println("Pool cleaning company works: " + service);
    }
}
