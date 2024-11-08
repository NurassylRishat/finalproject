package observer;

import device.SmartDevice;
import java.util.ArrayList;
import java.util.List;

public class DeviceObserver {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void updateAll() {
        for (SmartDevice device : devices) {
            device.operate();
        }
    }
}
