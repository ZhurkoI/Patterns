package org.example.behavioral.memento;

public class ApplicationRunner {

    public static void main(String[] args) throws InterruptedException {
        VirtualMachine myVirtMachine = new VirtualMachine();
        myVirtMachine.setState("This is my first clean VM", "Snapshot comment #1");
        System.out.println("Current VM state:");
        System.out.println(myVirtMachine);

        System.out.println("Taking a snapshot...");
        SnapshotStorage storage = new SnapshotStorage();
        storage.saveSnapshot(myVirtMachine.takeSnapshot());

        Thread.sleep(5000);
        System.out.println("Installing apps on the VM.");
        myVirtMachine.setState("VM with installed apps and drivers", "Snapshot comment #2");
        System.out.println("Current VM state:");
        System.out.println(myVirtMachine);

        System.out.println("Restoring from previous snapshot...");
        myVirtMachine.restoreFromSnapshot(storage.getSnapshot());
        System.out.println("Current VM state:");
        System.out.println(myVirtMachine);
    }
}
