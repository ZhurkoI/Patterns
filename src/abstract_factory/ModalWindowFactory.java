package abstract_factory;

public interface ModalWindowFactory {
    Button getButton();

    WindowControlButtonsBlock getWindowControlButtonsBlock();

    Title getTitle();
}
