package org.example.structural.facade;

public class ApplicationRunner {

    public static void main(String[] args) {
        String file = "Titanik";

        MediaCompressor mCompressor = new MediaCompressor(file);
        mCompressor.compressAndSave();
    }
}
