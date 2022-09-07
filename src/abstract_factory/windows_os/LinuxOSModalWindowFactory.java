package abstract_factory.windows_os;

import abstract_factory.Button;
import abstract_factory.ModalWindowFactory;
import abstract_factory.Title;
import abstract_factory.WindowControlButtonsBlock;

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
