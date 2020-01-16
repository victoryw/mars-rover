package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Move;
import com.thoughtworks.marsrover.command.TurnLeft;
import com.thoughtworks.marsrover.command.TurnRight;
import com.thoughtworks.marsrover.status.Direction;
import com.thoughtworks.marsrover.status.Location;
import com.thoughtworks.marsrover.status.RoverStatus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsCenter {
    public static MarsRover init(String initStr) {
        final List<String> init = Arrays.stream(initStr.split("")).
                filter(anObject -> !" ".equals(anObject)).collect(Collectors.toList());
        final int x = Integer.parseInt(init.get(0));
        final int y = Integer.parseInt(init.get(1));
        Location location = new Location(x, y);
        Direction direction = Direction.createDirection(init.get(2));
        return new MarsRover(location, direction);
    }

    public static MarsRover command(String commands, MarsRover marsRover) {
        Arrays.asList(commands.split("")).forEach(command -> {
            RoverStatus newStatus = marsRover.getStatus();
            switch (command) {
                case "L":
                    newStatus = new TurnLeft(newStatus).doOperate();
                    break;
                case "R":
                    newStatus = new TurnRight(newStatus).doOperate();
                    break;
                case "M":
                    newStatus = new Move(newStatus).doOperate();
                    break;
                case "B":
                    newStatus = new Back(newStatus).doOperate();
                    break;
            }
            marsRover.update(newStatus);
        });

        return marsRover;
    }
}
