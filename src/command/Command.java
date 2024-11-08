package command;

import device.SmartDevice;

public interface Command {
    void execute(SmartDevice device);
}
