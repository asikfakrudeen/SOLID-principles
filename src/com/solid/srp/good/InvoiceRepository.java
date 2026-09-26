package com.solid.srp.good;

/**
 * ✅ FOLLOWS SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * Single Responsibility: Database persistence for Invoices.
 * Has ONLY ONE reason to change: Changes in database infrastructure or ORM mapping.
 */
public class InvoiceRepository {

    public void save(Invoice invoice) {
        System.out.println("[REPOSITORY] Saving invoice for " + invoice.getCustomerEmail() + " to Database...");
        System.out.printf("[REPOSITORY] INSERT INTO invoices VALUES ('%s', %.2f);%n",
                invoice.getCustomerEmail(), invoice.calculateTotal());
        System.out.println("[REPOSITORY] Invoice saved successfully!");
    }
}
