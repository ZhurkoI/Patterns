package org.example.behavioral.memento;

public class SnapshotStorage {

    private Snapshot snapshot;

    public void saveSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public Snapshot getSnapshot() {
        return snapshot;
    }
}
