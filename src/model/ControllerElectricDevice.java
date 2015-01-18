package model;

public class ControllerElectricDevice {
    
    private ElectricDevice device;

    public ControllerElectricDevice(ElectricDevice device) {
        this.device = device;
    }

    public ElectricDevice getDevice() {
        return device;
    }

    public void setDevice(ElectricDevice device) {
        this.device = device;
    }
    
    public void showState() {
        System.out.println(device.getState());
    }
    
}
