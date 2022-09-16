package org.example.behavioral.chain;

public class DustCleaner extends HouseKeeper {

    public DustCleaner(int costOfService) {
        super(costOfService);
    }

    @Override
    public void doService(String service) {
        System.out.println("Dust cleaning company works: " + service);
    }
}
