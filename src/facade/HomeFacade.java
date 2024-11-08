package facade;

import device.Light;
import device.Thermostat;

public class HomeFacade {
    private Light light;
    private Thermostat thermostat;

    public HomeFacade() {
        light = new Light();
        thermostat = new Thermostat();
    }

    public void activateHome() {
        light.operate();
        thermostat.operate();
    }
}
