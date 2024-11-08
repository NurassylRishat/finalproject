package device.factory;

import device.SmartDevice;
import device.Light;
import device.Thermostat;

public class SmartDeviceFactory {
    public static SmartDevice createDevice(String deviceType) {
        switch (deviceType) {
            case "Light":
                return new Light();
            case "Thermostat":
                return new Thermostat();
            default:
                throw new IllegalArgumentException("Unknown device type");
        }
    }
}
