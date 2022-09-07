package abstract_factory.mac_os;

import abstract_factory.Button;

public class macButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("Button has MacOS style");
    }
}
