package org.example.behavioral.observer;

public class Follower implements Observer {

    String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String leaderName, String status) {
        System.out.printf("Hey %s! User %s has changed his status to '%s'%n", name, leaderName, status);
        System.out.printf("==============================================%n");
    }
}
