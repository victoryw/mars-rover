package com.thoughtworks.marsrover;

public class EastDirection extends Direction {
    @Override
    public Direction right() {
        return createDirection("S");
    }

    @Override
    public Direction left() {
        return createDirection("N");
    }

    @Override
    public String getDirection() {
        return "E";
    }
}
