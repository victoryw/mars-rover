package com.thoughtworks.marsrover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Test
    public void should_get_the_current_mars_rover_report() {
        marsRover = MarsRover.init("0 0 N");
        final String report = marsRover.report();
        Assert.assertEquals("0 0 N", report);
    }

    @Test
    public void should_turn_to_east_when_the_faced_north_rover_receive_left_command() {
        marsRover = MarsRover.init("0 0 N");
        final String report = marsRover.receive("L");
        Assert.assertEquals("0 0 E", report);
    }

    @Test
    public void should_turn_to_west_when_the_faced_north_rover_receive_right_command() {
        marsRover = MarsRover.init("0 0 N");
        final String report = marsRover.receive("R");
        Assert.assertEquals("0 0 W", report);
    }

    @Test
    public void should_turn_to_north_when_the_faced_west_rover_receive_left_command() {
        marsRover = MarsRover.init("0 0 W");
        final String report = marsRover.receive("L");
        Assert.assertEquals("0 0 S", report);
    }

    @Test
    public void should_turn_to_north_when_the_faced_west_rover_receive_right_command() {
        marsRover = MarsRover.init("0 0 W");
        final String report = marsRover.receive("R");
        Assert.assertEquals("0 0 N", report);
    }
}
