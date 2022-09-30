package org.example.behavioral.memento;

import java.util.Date;

public class VirtualMachine {

    private String vmDescription;
    private String snapshotComment;
    private Date snapshotDate;

    public void setState(String vmDescription, String snapshotComment) {
        this.vmDescription = vmDescription;
        this.snapshotComment = snapshotComment;
        this.snapshotDate = new Date();
    }

    public Snapshot takeSnapshot() {
        return new Snapshot(vmDescription, snapshotComment);
    }

    public void restoreFromSnapshot(Snapshot snapshot) {
        vmDescription = snapshot.getVmDescription();
        snapshotComment = snapshot.getSnapshotComment();
        snapshotDate = snapshot.getSnapshotDate();
    }

    @Override
    public String toString() {
        return "VirtualMachine{" +
                "vmDescription='" + vmDescription + '\'' +
                ", snapshotComment='" + snapshotComment + '\'' +
                ", snapshotDate=" + snapshotDate +
                '}';
    }
}
