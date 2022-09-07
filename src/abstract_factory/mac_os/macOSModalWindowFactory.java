package abstract_factory.mac_os;

import abstract_factory.Button;
import abstract_factory.ModalWindowFactory;
import abstract_factory.Title;
import abstract_factory.WindowControlButtonsBlock;

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
