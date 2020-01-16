package com.thoughtworks.marsrover.status;

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
    public Location forward() {
        return new Location(0 , 1);
    }
}

