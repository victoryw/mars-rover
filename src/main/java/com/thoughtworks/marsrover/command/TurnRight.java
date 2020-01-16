package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.status.Direction;
import com.thoughtworks.marsrover.status.RoverStatus;

public class TurnRight implements Command {
    private RoverStatus roverStatus;

    public TurnRight(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    @Override
    public RoverStatus doOperate() {
        final Direction result = roverStatus.getDiection().right();
        return new RoverStatus(roverStatus.getLocation(), result);
    }
}


