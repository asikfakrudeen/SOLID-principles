package com.solid.srp.bad;

import com.solid.srp.InvoiceItem;
import java.util.ArrayList;
import java.util.List;

/**
 * ❌ VIOLATION OF SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * Why is this BAD?
 * This single class has 4 DIFFERENT REASONS TO CHANGE:
 * 1. Business Logic changes (how subtotal or tax rate is computed).
 * 2. Printing changes (if we switch from text format to PDF or JSON).
 * 3. Database changes (if we change SQL statements or DB provider).
 * 4. Notification changes (if email template or email provider changes).
 *
 * Swiss Army Knife Analogy:
 * If your corkscrew breaks, you shouldn't have to replace your entire knife!
 */
public class InvoiceBad {
    private final List<InvoiceItem> items = new ArrayList<>();
    private final String customerEmail;
    private final double taxRate;

    public InvoiceBad(String customerEmail, double taxRate) {
        this.customerEmail = customerEmail;
        this.taxRate = taxRate;
    }

    public void addItem(InvoiceItem item) {
        items.add(item);
    }

    // 1. BUSINESS LOGIC RESPONSIBILITY
    public double calculateTotal() {
        double subtotal = 0;
        for (InvoiceItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal + (subtotal * taxRate);
    }

    // 2. PRINTING RESPONSIBILITY (Violates SRP!)
    public void printInvoice() {
        System.out.println("----- INVOICE (BAD SRP) -----");
        System.out.println("Customer: " + customerEmail);
        for (InvoiceItem item : items) {
            System.out.println("- " + item.getName() + " x" + item.getQuantity() + " = $" + item.getTotalPrice());
        }
        System.out.println("Total (incl. tax): $" + calculateTotal());
        System.out.println("-----------------------------");
    }

    // 3. PERSISTENCE RESPONSIBILITY (Violates SRP!)
    public void saveToDatabase() {
        System.out.println("[DB LOGIC] Connecting to Database...");
        System.out.println("[DB LOGIC] INSERT INTO invoices VALUES ('" + customerEmail + "', " + calculateTotal() + ");");
        System.out.println("[DB LOGIC] Invoice saved successfully!");
    }

    // 4. NOTIFICATION RESPONSIBILITY (Violates SRP!)
    public void sendEmailNotification() {
        System.out.println("[EMAIL LOGIC] Connecting to SMTP Server...");
        System.out.println("[EMAIL LOGIC] Sending invoice summary to " + customerEmail);
        System.out.println("[EMAIL LOGIC] Email sent!");
    }
}
