package org.example.structural.decorator;

public class SpicyFood extends FoodDecorator {
    public SpicyFood(Food food) {
        super(food);
    }

    void spiceFood() {
        System.out.print(" Adding some spices...");
    }

    @Override
    public void makeFood() {
        super.makeFood();
        spiceFood();
    }
}
