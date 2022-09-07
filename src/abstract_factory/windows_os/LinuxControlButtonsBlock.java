package abstract_factory.windows_os;

import abstract_factory.WindowControlButtonsBlock;

public class LinuxControlButtonsBlock implements WindowControlButtonsBlock {
    @Override
    public void displayWindowControlButtons() {
        System.out.println("The block of control buttons is displayed on the right.");
    }
}
