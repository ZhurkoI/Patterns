package org.example.structural.adapter;

/**
 * This class represents a third-party library with the interface that is incompatible client code.
 */
public class JsonProcessor {

    String readJson() {
        return "Content of JSON file.";
    }

    void saveToJson() {
        System.out.println("Info is saving to JSON...");
    }
}
