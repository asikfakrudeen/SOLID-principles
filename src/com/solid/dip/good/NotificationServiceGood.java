package com.solid.dip.good;

/**
 * ✅ FOLLOWS DEPENDENCY INVERSION PRINCIPLE (DIP)
 *
 * High-level business module depends ONLY on the MessageService abstraction.
 * Specific implementation is injected via Constructor (Dependency Injection).
 *
 * Benefits:
 * 1. Complete Decoupling: Switch between Email, SMS, or Push without modifying this class.
 * 2. High Testability: Easily inject a MockMessageService for unit tests!
 */
public class NotificationServiceGood {
    private final MessageService messageService;

    // Dependency Injection via Constructor
    public NotificationServiceGood(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String recipient, String text) {
        // High-level business logic
        System.out.println("[BUSINESS LOGIC] Processing user notification...");
        messageService.sendMessage(recipient, text);
    }
}
