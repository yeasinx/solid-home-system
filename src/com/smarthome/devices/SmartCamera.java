package com.smarthome.devices;

import com.smarthome.interfaces.MotionDetectable;
import com.smarthome.interfaces.Switchable;

public class SmartCamera implements Switchable, MotionDetectable {
    @Override
    public void turnOn() {
        System.out.println("Turning on the camera");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning off the camera");
    }
    @Override
    public boolean isMotionDetected() {
        return true;
    }
}
