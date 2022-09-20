package org.example.behavioral.observer;

public class SocialNetwork {

    public static void main(String[] args) {
        LeadUser elonMusk = new LeadUser("Elon Musk", "I'm working on PayPal");
        Observer vasya = new Follower("Vasya");
        Observer john = new Follower("John");

        elonMusk.addObserver(vasya);
        elonMusk.addObserver(john);

        elonMusk.changeStatus("I'm working on Tesla Model S");

        elonMusk.removeObserver(vasya);
        elonMusk.changeStatus("I'm working on Starlink");
    }
}
