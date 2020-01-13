package com.thoughtworks.marsrover;

public class SouthDirection extends Direction {
    @Override
    public Direction right() {
        return createDirection("W");
    }

    @Override
    public Direction left() {
        return createDirection("E");
    }

    @Override
    public String getDirection() {
        return "S";
    }
}

