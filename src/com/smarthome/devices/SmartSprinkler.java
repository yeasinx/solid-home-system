package com.smarthome.devices;

import com.smarthome.interfaces.MotionDetectable;
import com.smarthome.interfaces.Switchable;

public class SmartSprinkler implements Switchable, MotionDetectable {
    @Override
    public void turnOn() {
        System.out.println("Sprinkler ON");
    }
    @Override
    public void turnOff() {
        System.out.println("Sprinkler OFF");
    }

    @Override
    public boolean isMotionDetected() {
        return true;
    }
}
