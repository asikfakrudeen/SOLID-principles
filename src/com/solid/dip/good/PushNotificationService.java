package com.solid.dip.good;

public class PushNotificationService implements MessageService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("[PUSH SERVICE] Sending Mobile Push Notification to " + recipient + ": " + message);
    }
}
