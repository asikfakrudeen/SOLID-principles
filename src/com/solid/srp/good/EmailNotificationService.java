package com.solid.srp.good;

/**
 * ✅ FOLLOWS SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * Single Responsibility: Email communication.
 * Has ONLY ONE reason to change: Changes in email delivery system or email templates.
 */
public class EmailNotificationService {

    public void sendInvoiceNotification(Invoice invoice) {
        System.out.println("[EMAIL SERVICE] Preparing email for " + invoice.getCustomerEmail() + "...");
        System.out.printf("[EMAIL SERVICE] Subject: Invoice Confirmation - Total $%.2f%n", invoice.calculateTotal());
        System.out.println("[EMAIL SERVICE] Email dispatched successfully!");
    }
}
