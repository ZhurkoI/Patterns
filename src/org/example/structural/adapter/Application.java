package org.example.structural.adapter;

public class Application {

    public static void main(String[] args) {
        FileProcessor processor = new AdapterJsonToApp();

        System.out.println(processor.readFile());
        processor.writeFile();
    }
}
