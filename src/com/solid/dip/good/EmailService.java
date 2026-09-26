package com.solid.dip.good;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("[EMAIL SERVICE] Dispatching email to " + recipient + ": " + message);
    }
}
