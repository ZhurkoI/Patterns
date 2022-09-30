package org.example.creational.abstract_factory.mac_os;

import org.example.creational.abstract_factory.Button;
import org.example.creational.abstract_factory.ModalWindowFactory;
import org.example.creational.abstract_factory.Title;
import org.example.creational.abstract_factory.WindowControlButtonsBlock;

public class macOSModalWindowFactory implements ModalWindowFactory {
    @Override
    public Button getButton() {
        return new macButton();
    }

    @Override
    public WindowControlButtonsBlock getWindowControlButtonsBlock() {
        return new macControlButtonsBlock();
    }

    @Override
    public Title getTitle() {
        return new macTitle();
    }
}
