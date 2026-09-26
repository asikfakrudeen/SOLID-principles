package com.solid.dip.bad;

/**
 * ❌ VIOLATION OF DEPENDENCY INVERSION PRINCIPLE (DIP)
 *
 * Why is this BAD?
 * High-level module (NotificationServiceBad) directly instantiates low-level concrete class (EmailSenderBad).
 *
 * Problems:
 * 1. Tight Coupling: Cannot send SMS or Push notifications without editing this class.
 * 2. Hard to Unit Test: Cannot mock EmailSenderBad during unit testing.
 * 3. Analogy: Soldering your television power cord directly into the city power grid wires!
 */
public class NotificationServiceBad {
    private final EmailSenderBad emailSender;

    public NotificationServiceBad() {
        // Direct instantiation of concrete low-level class!
        this.emailSender = new EmailSenderBad();
    }

    public void notifyUser(String userEmail, String message) {
        emailSender.sendEmail(userEmail, message);
    }
}
