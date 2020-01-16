package com.thoughtworks.marsrover.status;

public class RoverStatus {
    private final Location location;
    private final Direction direction;
    private boolean isBack = false;

    public RoverStatus(Location location, Direction direction) {

        this.location = location;
        this.direction = direction;
    }

    public RoverStatus(Location location, Direction direction, boolean isBack) {
        this(location, direction);
        this.isBack = isBack;
    }

    public Direction getDiection() {
        return this.direction;
    }

    public Location getLocation() {
        return this.location;
    }

    public RoverStatus inBack() {
        return new RoverStatus(location, direction, true);
    }

    public boolean getIsBack() {
        return this.isBack;
    }
}
