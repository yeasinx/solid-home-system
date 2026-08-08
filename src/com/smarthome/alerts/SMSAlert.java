package com.smarthome.alerts;

import com.smarthome.interfaces.AlertChannel;

public class SMSAlert implements AlertChannel {
    @Override
    public void sendAlert(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
