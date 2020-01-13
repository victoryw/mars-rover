package com.thoughtworks.marsrover;

public class NorthDirection extends Direction {
    public NorthDirection() {
    }

    @Override
    public Direction right() {
        return createDirection(West);
    }

    @Override
    public Direction left() {
        return createDirection(East);
    }

    @Override
    public String getDirection() {
        return North;
    }

    @Override
    public Location move(Location location) {
        return new Location(location.getX(), location.getY() + 1);
    }
}

