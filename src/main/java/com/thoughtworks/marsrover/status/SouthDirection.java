package com.thoughtworks.marsrover.status;

public class SouthDirection extends Direction {
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
        return South;
    }


    @Override
    public Location forward() {
        return new Location(0 , -1);
    }
}

