package com.thoughtworks.marsrover;

public class NorthDirection extends Direction {
    public NorthDirection() {
    }

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
        return "N";
    }
}

