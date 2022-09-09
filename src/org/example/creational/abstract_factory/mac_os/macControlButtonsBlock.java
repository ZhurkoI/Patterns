package org.example.creational.abstract_factory.mac_os;

import org.example.creational.abstract_factory.WindowControlButtonsBlock;

public class macControlButtonsBlock implements WindowControlButtonsBlock {
    @Override
    public void displayWindowControlButtons() {
        System.out.println("The block of control buttons is displayed on the left.");
    }
}
