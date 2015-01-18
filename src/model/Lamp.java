package model;

public class Lamp extends ElectricDevice {
    
    public Lamp() {
        super();
    }

    @Override
    protected void turnOn() {
        this.setState(State.ON);
    }

    @Override
    protected void turnOff() {
        this.setState(State.OFF);
    }
    
}
