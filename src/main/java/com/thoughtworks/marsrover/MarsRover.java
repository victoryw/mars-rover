package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover {
    private Location location;
    private Direction direction;

    public MarsRover(Location location, Direction direction) {

        this.location = location;
        this.direction = direction;
    }

    public static MarsRover init(String initStr) {
        final List<String> init = Arrays.stream(initStr.split("")).
                filter(anObject -> !" ".equals(anObject)).collect(Collectors.toList());
        final int x = Integer.parseInt(init.get(0));
        final int y = Integer.parseInt(init.get(1));
        Location location = new Location(x, y);
        Direction direction = Direction.createDirection(init.get(2));
        return new MarsRover(location, direction);
    }

    public String report() {
        return String.format("%d %d %s", location.getX(), location.getY(), direction.getDirection());
    }

    public String receive(String commands) {
        Arrays.asList(commands.split("")).forEach(command -> {
            switch (command) {
                case "L":
                    this.direction = this.direction.left();
                    break;
                case "R":
                    this.direction = this.direction.right();
                    break;
                case "M":
                    this.location = this.direction.move(this.location);
                    break;
            }
        });

        return this.report();
    }

}
