package org.example.creational.abstract_factory.windows_os;

import org.example.creational.abstract_factory.Button;
import org.example.creational.abstract_factory.ModalWindowFactory;
import org.example.creational.abstract_factory.Title;
import org.example.creational.abstract_factory.WindowControlButtonsBlock;

public class LinuxOSModalWindowFactory implements ModalWindowFactory {
    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public WindowControlButtonsBlock getWindowControlButtonsBlock() {
        return new LinuxControlButtonsBlock();
    }

    @Override
    public Title getTitle() {
        return new LinuxTitle();
    }
}
