package com.thoughtworks.marsrover;

public class Location {
    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Location(int x, int y) {

        this.x = x;
        this.y = y;
    }
}
