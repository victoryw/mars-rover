package com.thoughtworks.marsrover;

public class EastDirection extends Direction {

    @Override
    public Direction right() {
        return createDirection(South);
    }

    @Override
    public Direction left() {
        return createDirection(North);
    }

    @Override
    public String getDirection() {
        return East;
    }

    @Override
    public Location move(Location location) {
        return new Location(location.getX() - 1, location.getY());
    }
}
