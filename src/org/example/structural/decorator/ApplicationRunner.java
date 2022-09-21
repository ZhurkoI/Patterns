package org.example.structural.decorator;

public class ApplicationRunner {

    public static void main(String[] args) {
        String rawFood = "Meat";

        Food dish1 = new BaseFood(rawFood);
        dish1.makeFood();
        System.out.println("\n====================================");

        Food dish2 = new FriedFood(dish1);
        dish2.makeFood();
        System.out.println("\n====================================");

        Food dish3 = new SpicyFood(dish2);
        dish3.makeFood();
    }
}
