package org.example.structural.adapter;

public class AdapterJsonToApp extends JsonProcessor implements FileProcessor {

    @Override
    public String readFile() {
        return readJson();
    }

    @Override
    public void writeFile() {
        saveToJson();
    }
}
