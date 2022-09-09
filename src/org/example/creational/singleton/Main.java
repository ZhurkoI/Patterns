package org.example.creational.singleton;

public class Main {

    public static void main(String[] args) {
        Database.getDatabaseInstance().saveToDB("entry A");
        Database.getDatabaseInstance().saveToDB("entry B");
        Database.getDatabaseInstance().saveToDB("entry C");

        System.out.println(Database.getDatabaseInstance().readFromDB());
    }
}
