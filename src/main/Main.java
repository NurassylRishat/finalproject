package main;

import controller.HomeController;
import command.Command;
import command.TurnOnCommand;
import device.SmartDevice;
import device.factory.SmartDeviceFactory;
import device.ThirdPartyThermostat;
import device.ThirdPartyThermostatAdapter;
import observer.DeviceObserver;
import facade.HomeFacade;

public class Main {
    public static void main(String[] args) {
        // Singleton HomeController
        HomeController controller = HomeController.getInstance();

        // Factory Method to create devices
        SmartDevice light = SmartDeviceFactory.createDevice("Light");
        SmartDevice thermostat = SmartDeviceFactory.createDevice("Thermostat");

        // Command Pattern to operate devices
        Command turnOn = new TurnOnCommand();
        controller.manageDevice(light, turnOn);
        controller.manageDevice(thermostat, turnOn);

        // Using the adapter for third-party thermostat
        ThirdPartyThermostat thirdPartyThermostat = new ThirdPartyThermostat();
        SmartDevice thirdPartyThermostatAdapter = new ThirdPartyThermostatAdapter(thirdPartyThermostat);
        thirdPartyThermostatAdapter.operate();

        // Observer Pattern to update devices
        DeviceObserver observer = new DeviceObserver();
        observer.addDevice(light);
        observer.addDevice(thermostat);
        observer.addDevice(thirdPartyThermostatAdapter);
        observer.updateAll();

        // Facade Pattern for home activation
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.activateHome();
    }
}
