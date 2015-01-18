package model;

public class Switch extends ControllerElectricDevice {

    public Switch(ElectricDevice device) {
        super(device);
    }
    
    public void push() {
        if(getDevice().getState() == ElectricDevice.State.ON) {
            this.getDevice().setState(ElectricDevice.State.OFF);
        }
        else this.getDevice().setState(ElectricDevice.State.ON);
    }
    
}
