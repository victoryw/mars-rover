package com.thoughtworks.marsrover;

public abstract class Direction {


    public static Direction createDirection(String direction) {
        if(direction.equals("N")) {
            return new NorthDirection();
        }

        if(direction.equals("W")) {
            return new WestDirection();
        }

        if(direction.equals("S")) {
            return new SouthDirection();
        }

        return new EastDirection();
    }

    public abstract Direction right();

    public abstract Direction left();

    public abstract String getDirection();
}
