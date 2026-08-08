package com.smarthome.devices;

import com.smarthome.interfaces.Switchable;

public class SmartLight implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light");
    }

    @Override
    public void turnOff() {
       System.out.println("Turning off the light");
    }
}
