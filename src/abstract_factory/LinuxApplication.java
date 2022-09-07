package abstract_factory;

import abstract_factory.windows_os.LinuxOSModalWindowFactory;

public class LinuxApplication {
    public static void main(String[] args) {
        ModalWindowFactory modalWindowFactory = new LinuxOSModalWindowFactory();
        Title title = modalWindowFactory.getTitle();
        Button button = modalWindowFactory.getButton();
        WindowControlButtonsBlock windowControlButtonsBlock = modalWindowFactory.getWindowControlButtonsBlock();

        System.out.println("Linux application is running...");
        title.displayTitle();
        button.displayButton();
        windowControlButtonsBlock.displayWindowControlButtons();
    }
}
