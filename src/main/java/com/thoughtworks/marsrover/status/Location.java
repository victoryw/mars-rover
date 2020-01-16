package com.thoughtworks.marsrover.status;

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

    public Location apply(Location next) {
        return new Location(x + next.getX(), y + next.getY());
    }
}
