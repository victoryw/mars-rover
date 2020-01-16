package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Move;
import com.thoughtworks.marsrover.command.TurnLeft;
import com.thoughtworks.marsrover.command.TurnRight;
import com.thoughtworks.marsrover.status.Direction;
import com.thoughtworks.marsrover.status.Location;
import com.thoughtworks.marsrover.status.RoverStatus;

import java.util.Arrays;

public class MarsRover {
    private Location location;
    private Direction direction;

    public MarsRover(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public static MarsRover of(MarsRover marsRover) {
        return new MarsRover(marsRover.location, marsRover.direction);
    }

    public String report() {
        return String.format("%d %d %s", location.getX(), location.getY(), direction.getDirection());
    }

    public RoverStatus getStatus() {
        return new RoverStatus(this.location, this.direction);
    }

    public void update(RoverStatus newStatus) {
        this.direction = newStatus.getDiection();
        this.location = newStatus.getLocation();
    }

    public Location getLocation() {
        return location;
    }
}
