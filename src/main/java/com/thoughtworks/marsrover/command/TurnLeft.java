package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.status.Direction;
import com.thoughtworks.marsrover.status.RoverStatus;

public class TurnLeft implements Command {
    private RoverStatus roverStatus;

    public TurnLeft(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    @Override
    public RoverStatus doOperate() {
        final Direction result = roverStatus.getDiection().left();
        return new RoverStatus(roverStatus.getLocation(), result);
    }
}


