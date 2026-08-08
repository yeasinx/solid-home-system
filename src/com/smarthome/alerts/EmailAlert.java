package com.smarthome.alerts;

import com.smarthome.interfaces.AlertChannel;

public class EmailAlert implements AlertChannel {
    @Override
    public void sendAlert(String message) {
        System.out.println("Sending Email: " + message);
    }
}
