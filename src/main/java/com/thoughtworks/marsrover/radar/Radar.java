package com.thoughtworks.marsrover.radar;

import com.thoughtworks.marsrover.MarsRover;

public class Radar {

    private Ditch ditch;
    private MarsRover marsRover;

    public Radar(Ditch ditch) {

        this.ditch = ditch;
    }

    public void validate(MarsRover marsRover) {
        final boolean isDitch = ditch.is(marsRover.getLocation());
        if(isDitch){
            this.marsRover = marsRover;
            throw new GoInToException();
        }
    };

    public MarsRover getMarsRover() {
        return marsRover;
    }
}
