package org.example.structural.decorator;

public class BaseFood implements Food {
    String name;

    public BaseFood(String name) {
        this.name = name;
    }

    @Override
    public void makeFood() {
        System.out.print(name + " is being cooked.");
    }
}
