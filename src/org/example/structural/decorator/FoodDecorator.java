package org.example.structural.decorator;

public class FoodDecorator implements Food {

    Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }


    @Override
    public void makeFood() {
        food.makeFood();
    }
}
