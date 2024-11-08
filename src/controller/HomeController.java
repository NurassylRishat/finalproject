package controller;

import command.Command;
import device.SmartDevice;

public class HomeController {
    private static HomeController instance;

    private HomeController() {}

    public static HomeController getInstance() {
        if (instance == null) {
            instance = new HomeController();
        }
        return instance;
    }

    public void manageDevice(SmartDevice device, Command command) {
        command.execute(device);
    }
}
