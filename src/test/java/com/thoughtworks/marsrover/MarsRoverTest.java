package com.thoughtworks.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_get_the_current_mars_rover_report() {
        final MarsRover marsRover = MarsRover.init("0 0 N");
        final String report = marsRover.report();
        Assert.assertEquals("0 0 N", report);
    }
}
