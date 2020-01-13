package com.thoughtworks.marsrover;

public class WestDirection extends Direction {

    @Override
    public Direction right() {
        return createDirection("N");
    }

    @Override
    public Direction left() {
        return createDirection("S");
    }

    @Override
    public String getDirection() {
        return "W";
    }
}
