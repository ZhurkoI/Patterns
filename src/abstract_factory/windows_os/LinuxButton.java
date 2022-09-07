package abstract_factory.windows_os;

import abstract_factory.Button;

public class LinuxButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("Button has Linux OS style.");
    }
}
