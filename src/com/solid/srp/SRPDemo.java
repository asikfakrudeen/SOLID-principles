package com.solid.srp;

import com.solid.srp.bad.InvoiceBad;
import com.solid.srp.good.*;

public class SRPDemo {
    public static void runDemo() {
        System.out.println("==================================================");
        System.out.println(" 1. SINGLE RESPONSIBILITY PRINCIPLE (SRP) DEMO");
        System.out.println("==================================================");

        // --- BAD EXAMPLE DEMO ---
        System.out.println("\n--- ❌ BEFORE (SRP Violation) ---");
        InvoiceBad badInvoice = new InvoiceBad("alex@example.com", 0.18);
        badInvoice.addItem(new InvoiceItem("MacBook Pro M3", 1, 1999.99));
        badInvoice.addItem(new InvoiceItem("USB-C Hub", 2, 49.99));

        // InvoiceBad does calculation, printing, saving, and emailing all by itself!
        badInvoice.printInvoice();
        badInvoice.saveToDatabase();
        badInvoice.sendEmailNotification();

        // --- GOOD EXAMPLE DEMO ---
        System.out.println("\n--- ✅ AFTER (SRP Compliant) ---");
        Invoice goodInvoice = new Invoice("alex@example.com", 0.18);
        goodInvoice.addItem(new InvoiceItem("MacBook Pro M3", 1, 1999.99));
        goodInvoice.addItem(new InvoiceItem("USB-C Hub", 2, 49.99));

        // Each component handles ONLY its single responsibility!
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();
        EmailNotificationService emailService = new EmailNotificationService();

        printer.print(goodInvoice);
        repository.save(goodInvoice);
        emailService.sendInvoiceNotification(goodInvoice);
    }
}
