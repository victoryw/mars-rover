package com.thoughtworks.marsrover;

public abstract class Direction {

    protected static final String North = "N";
    protected static final String West = "W";
    protected static final String South = "S";
    protected static final String East = "E";

    public static Direction createDirection(String direction) {
        if(direction.equals(North)) {
            return new NorthDirection();
        }

        if(direction.equals(West)) {
            return new WestDirection();
        }

        if(direction.equals(South)) {
            return new SouthDirection();
        }

        return new EastDirection();
    }

    public abstract Direction right();

    public abstract Direction left();

    public abstract String getDirection();

    public abstract Location move(Location location);
}
