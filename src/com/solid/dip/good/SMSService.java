package com.solid.dip.good;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("[SMS SERVICE] Dispatching SMS to " + recipient + ": " + message);
    }
}
