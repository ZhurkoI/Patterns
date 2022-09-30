package org.example.structural.decorator;

public class FriedFood extends FoodDecorator {
    public FriedFood(Food food) {
        super(food);
    }

    void fryFood() {
        System.out.print(" It is being fried.");
    }

    @Override
    public void makeFood() {
        super.makeFood();
        fryFood();
    }
}
