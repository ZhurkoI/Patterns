package abstract_factory.windows_os;

import abstract_factory.Title;

public class LinuxTitle implements Title {
    @Override
    public void displayTitle() {
        System.out.println("Title has Linux OS style.");
    }
}
