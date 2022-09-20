package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class LeadUser implements Observed {

    String name;
    String status;
    List<Observer> observers = new ArrayList<>();

    public LeadUser(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void changeStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(name, status);
        }
    }
}
