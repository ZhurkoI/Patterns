package org.example.creational.abstract_factory.mac_os;

import org.example.creational.abstract_factory.Button;

public class macButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("Button has MacOS style");
    }
}
