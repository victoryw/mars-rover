package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.status.Location;
import com.thoughtworks.marsrover.status.RoverStatus;

public class Move implements Command {
    private RoverStatus roverStatus;

    public Move(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    @Override
    public RoverStatus doOperate() {
        final Location result = roverStatus.getLocation().apply(roverStatus.getDiection().forward());
        return new RoverStatus(result, roverStatus.getDiection());
    }
}
