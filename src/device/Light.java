package device;

public class Light extends SmartDevice {
    @Override
    public void operate() {
        System.out.println("Light is turned on.");
    }
}
