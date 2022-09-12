package org.example.structural.facade;

public class MediaCompressor {
    String file;
    AudioCompressor audioCompressor = new AudioCompressor();
    VideoCompressor videoCompressor = new VideoCompressor();
    FileWriter fileWriter = new FileWriter();

    public MediaCompressor(String file) {
        this.file = file;
    }

    void compressAndSave() {
        audioCompressor.compress(file);
        videoCompressor.compress(file);
        fileWriter.saveOnDisk(file);
    }
}
