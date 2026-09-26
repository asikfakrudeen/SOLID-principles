package com.solid.srp.good;

import com.solid.srp.InvoiceItem;

/**
 * ✅ FOLLOWS SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * Single Responsibility: Renders and formats invoice reports.
 * Has ONLY ONE reason to change: Changes in presentation or reporting requirements.
 */
public class InvoicePrinter {

    public void print(Invoice invoice) {
        System.out.println("----- INVOICE REPORT (GOOD SRP) -----");
        System.out.println("Customer: " + invoice.getCustomerEmail());
        for (InvoiceItem item : invoice.getItems()) {
            System.out.printf("- %-15s x%d @ $%.2f = $%.2f%n",
                    item.getName(), item.getQuantity(), item.getPricePerUnit(), item.getTotalPrice());
        }
        System.out.printf("Subtotal: $%.2f%n", invoice.getSubtotal());
        System.out.printf("Tax:      $%.2f%n", invoice.getTaxAmount());
        System.out.printf("Total:    $%.2f%n", invoice.calculateTotal());
        System.out.println("-------------------------------------");
    }
}
