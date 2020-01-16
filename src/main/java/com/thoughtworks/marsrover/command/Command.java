package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.status.RoverStatus;

public interface Command {
    RoverStatus doOperate();
}
