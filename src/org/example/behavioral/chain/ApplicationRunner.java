package org.example.behavioral.chain;

public class ApplicationRunner {

    public static void main(String[] args) {
        HouseKeeper dustCleaner = new DustCleaner(500);
        HouseKeeper poolCleaner = new PoolCleaner(1000);
        HouseKeeper lawnCutter = new LawnCutter(2000);

        dustCleaner.setNextKeeper(poolCleaner);
        poolCleaner.setNextKeeper(lawnCutter);

        dustCleaner.cleanHouse("Service for poor people", 700);
        System.out.println("============================");
        dustCleaner.cleanHouse("Service for middle class people", 1200);
        System.out.println("============================");
        dustCleaner.cleanHouse("Service for rich people", 2500);
    }
}
