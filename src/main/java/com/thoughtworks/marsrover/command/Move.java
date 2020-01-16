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
        Location move = roverStatus.getDiection().forward();
        if(roverStatus.getIsBack()) {
            move = new Location(-move.getX(), - move.getY());
        }
        final Location result = roverStatus.getLocation().apply(move);
        return new RoverStatus(result, roverStatus.getDiection());
    }
}
