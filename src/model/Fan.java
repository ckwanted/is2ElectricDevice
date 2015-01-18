package model;

public class Fan extends ElectricDevice {

    public Fan() {
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
