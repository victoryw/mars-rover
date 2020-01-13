package com.thoughtworks.marsrover;

public abstract class Direction {


    public static Direction createDirection(String direction) {
        if(direction.equals("N")) {
            return new NorthDirection();
        }

        if(direction.equals("W")) {
            return new WestDirection();
        }

        return new Direction() {
            @Override
            public Direction right() {
                return null;
            }

            @Override
            public Direction left() {
                return null;
            }

            @Override
            public String getDirection() {
                return direction;
            }
        };

    }

    public abstract Direction right();

    public abstract Direction left();

    public abstract String getDirection();
}
