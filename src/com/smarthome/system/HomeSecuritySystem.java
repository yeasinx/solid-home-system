package com.smarthome.system;

import com.smarthome.interfaces.AlertChannel;
import com.smarthome.interfaces.MotionDetectable;
import com.smarthome.interfaces.Switchable;

import java.util.List;

// DIP & OCP: The high-level Orchestrator
public class HomeSecuritySystem {
    private final List<Switchable> switches;
    private final List<MotionDetectable> sensors;
    private final AlertChannel alertChannel;

    public HomeSecuritySystem(
            List<Switchable> switches,
            List<MotionDetectable> sensors,
            AlertChannel alertChannel
    ) {
        this.switches = switches;
        this.sensors = sensors;
        this.alertChannel = alertChannel;
    }

    public void armSystem() {
       System.out.println("--- Arming System ---");

       for (Switchable device: switches) {
           device.turnOn();
       }

       for (MotionDetectable sensor: sensors) {
           if (sensor.isMotionDetected()) {
               alertChannel.sendAlert("INTRUDER DETECTED!");
               return;
           }
       }

       System.out.println("All clear.");
    }
}
