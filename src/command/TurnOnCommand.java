package command;

import device.SmartDevice;

public class TurnOnCommand implements Command {
    @Override
    public void execute(SmartDevice device) {
        device.operate();
    }
}
