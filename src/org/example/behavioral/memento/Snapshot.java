package org.example.behavioral.memento;

import java.util.Date;

public class Snapshot {

    private final String vmDescription;
    private final String snapshotComment;
    private final Date date;

    public Snapshot(String vmDescription, String snapshotComment) {
        this.vmDescription = vmDescription;
        this.snapshotComment = snapshotComment;
        this.date = new Date();
    }

    public String getSnapshotComment() {
        return snapshotComment;
    }

    public String getVmDescription() {
        return vmDescription;
    }

    public Date getSnapshotDate() {
        return date;
    }
}
