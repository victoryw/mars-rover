package com.thoughtworks.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Test
    public void should_get_the_current_mars_rover_report() {
        marsRover = MarsCenter.init("0 0 N");
        final String report = marsRover.report();
        Assert.assertEquals("0 0 N", report);
    }

    @Test
    public void should_turn_to_east_when_the_faced_north_rover_receive_left_command() {
        marsRover = MarsCenter.init("0 0 N");
        final MarsRover marsRoverUpdated = MarsCenter.command("L", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 E", report);
    }

    @Test
    public void should_turn_to_west_when_the_faced_north_rover_receive_right_command() {
        marsRover = MarsCenter.init("0 0 N");
        final MarsRover marsRoverUpdated = MarsCenter.command("R", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 W", report);
    }

    @Test
    public void should_turn_to_north_when_the_faced_west_rover_receive_left_command() {
        marsRover = MarsCenter.init("0 0 W");
        final MarsRover marsRoverUpdated = MarsCenter.command("L", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 S", report);
    }

    @Test
    public void should_turn_to_north_when_the_faced_west_rover_receive_right_command() {
        marsRover = MarsCenter.init("0 0 W");
        final MarsRover marsRoverUpdated = MarsCenter.command("R", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 N", report);
    }

    @Test
    public void should_turn_to_east_when_the_faced_south_rover_receive_left_command() {
        marsRover = MarsCenter.init("0 0 S");
        final MarsRover marsRoverUpdated = MarsCenter.command("L", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 E", report);
    }

    @Test
    public void should_turn_to_west_when_the_faced_south_rover_receive_right_command() {
        marsRover = MarsCenter.init("0 0 S");
        final MarsRover marsRoverUpdated = MarsCenter.command("R", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 W", report);
    }

    @Test
    public void should_turn_to_north_when_the_faced_east_rover_receive_left_command() {
        marsRover = MarsCenter.init("0 0 E");
        final MarsRover marsRoverUpdated = MarsCenter.command("L", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 N", report);
    }

    @Test
    public void should_turn_to_south_when_the_faced_east_rover_receive_right_command() {
        marsRover = MarsCenter.init("0 0 E");
        final MarsRover marsRoverUpdated = MarsCenter.command("R", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 0 S", report);
    }

    @Test
    public void should_move_to_north_one_when_the_faced_north_rover_receive_move_command() {
        marsRover = MarsCenter.init("0 0 N");
        final MarsRover marsRoverUpdated = MarsCenter.command("M", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 1 N", report);
    }

    @Test
    public void should_move_to_south_one_when_the_faced_south_rover_receive_move_command() {
        marsRover = MarsCenter.init("0 0 S");
        final MarsRover marsRoverUpdated = MarsCenter.command("M", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 -1 S", report);
    }

    @Test
    public void should_move_to_east_one_when_the_faced_east_rover_receive_move_command() {
        marsRover = MarsCenter.init("0 0 E");
        final MarsRover marsRoverUpdated = MarsCenter.command("M", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("-1 0 E", report);
    }

    @Test
    public void should_move_to_west_one_when_the_faced_west_rover_receive_move_command() {
        marsRover = MarsCenter.init("0 0 W");
        final MarsRover marsRoverUpdated = MarsCenter.command("M", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("1 0 W", report);
    }

    @Test
    public void should_run_batch_command() {
        marsRover = MarsCenter.init("0 0 W");
        final MarsRover marsRoverUpdated = MarsCenter.command("RM", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("0 1 N", report);
    }

    @Test
    public void should_into_back_status() {
        marsRover = MarsCenter.init("0 0 W");
        final MarsRover marsRoverUpdated = MarsCenter.command("BM", marsRover);
        final String report = marsRoverUpdated.report();
        Assert.assertEquals("1 0 W", report);
    }
}
