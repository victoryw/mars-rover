package com.thoughtworks.marsrover.status;

public class RoverStatus {
    private final Location location;
    private final Direction direction;

    public RoverStatus(Location location, Direction direction) {

        this.location = location;
        this.direction = direction;
    }

    public Direction getDiection() {
        return this.direction;
    }

    public Location getLocation() {
        return this.location;
    }
}
