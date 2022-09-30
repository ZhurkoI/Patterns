package org.example.creational.abstract_factory;

import org.example.creational.abstract_factory.mac_os.macOSModalWindowFactory;

public class MacOsApplication {
    public static void main(String[] args) {
        ModalWindowFactory modalWindowFactory = new macOSModalWindowFactory();
        Title title = modalWindowFactory.getTitle();
        Button button = modalWindowFactory.getButton();
        WindowControlButtonsBlock windowControlButtonsBlock = modalWindowFactory.getWindowControlButtonsBlock();

        System.out.println("MacOS application is running...");
        title.displayTitle();
        button.displayButton();
        windowControlButtonsBlock.displayWindowControlButtons();
    }
}
