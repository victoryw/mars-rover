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

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.x;
        result = 31 * result + this.y;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Location)) {
            return false;
        }

        Location other = (Location) o;

        return other.getX() == this.x && other.getY() == this.y;
    }
}
