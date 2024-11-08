package device;

public class ThirdPartyThermostatAdapter extends SmartDevice {
    private ThirdPartyThermostat thirdPartyThermostat;

    public ThirdPartyThermostatAdapter(ThirdPartyThermostat thirdPartyThermostat) {
        this.thirdPartyThermostat = thirdPartyThermostat;
    }

    @Override
    public void operate() {
        thirdPartyThermostat.setTemperature();
    }
}
