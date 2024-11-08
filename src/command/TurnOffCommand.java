package command;

import device.SmartDevice;

public class TurnOffCommand implements Command {
    @Override
    public void execute(SmartDevice device) {
        System.out.println("Device is turned off.");
    }
}
