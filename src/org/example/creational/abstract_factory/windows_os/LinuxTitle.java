package org.example.creational.abstract_factory.windows_os;

import org.example.creational.abstract_factory.Title;

public class LinuxTitle implements Title {
    @Override
    public void displayTitle() {
        System.out.println("Title has Linux OS style.");
    }
}
