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

    @Test
    public void should_turn_to_east_when_the_faced_south_rover_receive_left_command() {
        marsRover = MarsRover.init("0 0 S");
        final String report = marsRover.receive("L");
        Assert.assertEquals("0 0 E", report);
    }

    @Test
    public void should_turn_to_west_when_the_faced_south_rover_receive_right_command() {
        marsRover = MarsRover.init("0 0 S");
        final String report = marsRover.receive("R");
        Assert.assertEquals("0 0 W", report);
    }

    @Test
    public void should_turn_to_north_when_the_faced_east_rover_receive_left_command() {
        marsRover = MarsRover.init("0 0 E");
        final String report = marsRover.receive("L");
        Assert.assertEquals("0 0 N", report);
    }

    @Test
    public void should_turn_to_south_when_the_faced_east_rover_receive_right_command() {
        marsRover = MarsRover.init("0 0 E");
        final String report = marsRover.receive("R");
        Assert.assertEquals("0 0 S", report);
    }

    @Test
    public void should_move_to_north_one_when_the_faced_north_rover_receive_move_command() {
        marsRover = MarsRover.init("0 0 N");
        final String report = marsRover.receive("M");
        Assert.assertEquals("0 1 N", report);
    }

    @Test
    public void should_move_to_south_one_when_the_faced_south_rover_receive_move_command() {
        marsRover = MarsRover.init("0 0 S");
        final String report = marsRover.receive("M");
        Assert.assertEquals("0 -1 S", report);
    }

    @Test
    public void should_move_to_east_one_when_the_faced_east_rover_receive_move_command() {
        marsRover = MarsRover.init("0 0 E");
        final String report = marsRover.receive("M");
        Assert.assertEquals("-1 0 E", report);
    }

    @Test
    public void should_move_to_west_one_when_the_faced_west_rover_receive_move_command() {
        marsRover = MarsRover.init("0 0 W");
        final String report = marsRover.receive("M");
        Assert.assertEquals("1 0 W", report);
    }

    @Test
    public void should_run_batch_command() {
        marsRover = MarsRover.init("0 0 W");
        final String report = marsRover.receive("RM");
        Assert.assertEquals("0 1 N", report);
    }

    @Test
    public void should_into_back_status() {
        marsRover = MarsRover.init("0 0 W");
        final String report = marsRover.receive("BM");
        Assert.assertEquals("1 0 W", report);
    }
}
