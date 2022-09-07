package abstract_factory.mac_os;

import abstract_factory.Title;

public class macTitle implements Title {
    @Override
    public void displayTitle() {
        System.out.println("Window has MacOS style.");
    }
}
