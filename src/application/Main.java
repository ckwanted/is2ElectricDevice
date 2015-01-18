package application;

import model.Lamp;
import model.Switch;

public class Main {
    
    public static void main(String[] args) {
        
        Lamp lamp = new Lamp();
        Switch switch1 = new Switch(lamp);
        switch1.showState();
        
        switch1.push();
        switch1.showState();
        
    }
    
}
