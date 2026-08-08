package com.smarthome.devices;

import com.smarthome.interfaces.Lockable;
import com.smarthome.interfaces.Switchable;

public class SmartDoor implements Switchable, Lockable {
    @Override
    public void turnOn() {
        System.out.println(" \uD83D\uDEAA Door Unlocked");
    }
    @Override
    public void turnOff() {
        System.out.println(" \uD83D\uDEAA Door Locked");
    }

    @Override
    public void lock() {
        System.out.println(" \uD83D\uDD12 Deadbolt Locked");
    }
    @Override
    public void unlock() {
        System.out.println(" \uD83D\uDD12 Deadbolt Unlocked");
    }
}
