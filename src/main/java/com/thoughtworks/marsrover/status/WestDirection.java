package com.thoughtworks.marsrover.status;

public class WestDirection extends Direction {

    @Override
    public Direction right() {
        return createDirection(North);
    }

    @Override
    public Direction left() {
        return createDirection(South);
    }

    @Override
    public String getDirection() {
        return West;
    }


    @Override
    public Location forward() {
        return new Location(1 , 0);
    }
}
