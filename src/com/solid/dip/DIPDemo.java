package com.solid.dip;

import com.solid.dip.bad.NotificationServiceBad;
import com.solid.dip.good.*;

public class DIPDemo {
    public static void runDemo() {
        System.out.println("\n==================================================");
        System.out.println(" 5. DEPENDENCY INVERSION PRINCIPLE (DIP) DEMO");
        System.out.println("==================================================");

        // --- BAD EXAMPLE DEMO ---
        System.out.println("\n--- ❌ BEFORE (DIP Violation - Hardcoded Instantiation) ---");
        NotificationServiceBad badService = new NotificationServiceBad();
        badService.notifyUser("user@example.com", "Your order #1001 has shipped!");
        System.out.println("⚠️ NotificationServiceBad is hardcoded to EmailSenderBad!");

        // --- GOOD EXAMPLE DEMO ---
        System.out.println("\n--- ✅ AFTER (DIP Compliant - Dependency Injection) ---");

        System.out.println("1. Injecting Email Service:");
        NotificationServiceGood emailNotifier = new NotificationServiceGood(new EmailService());
        emailNotifier.notifyUser("user@example.com", "Your order #1002 has shipped!");

        System.out.println("\n2. Injecting SMS Service (Zero changes to NotificationServiceGood!):");
        NotificationServiceGood smsNotifier = new NotificationServiceGood(new SMSService());
        smsNotifier.notifyUser("+1-555-0199", "Your OTP code is 482910");

        System.out.println("\n3. Injecting Push Notification Service:");
        NotificationServiceGood pushNotifier = new NotificationServiceGood(new PushNotificationService());
        pushNotifier.notifyUser("DeviceToken_XYZ88", "You received a new message!");
    }
}
