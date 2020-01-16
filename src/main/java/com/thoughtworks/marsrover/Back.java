package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.status.RoverStatus;

public class Back {
    private RoverStatus newStatus;

    public Back(RoverStatus newStatus) {
        this.newStatus = newStatus;
    }

    public RoverStatus doOperate() {
        return newStatus.inBack();
    }
}
