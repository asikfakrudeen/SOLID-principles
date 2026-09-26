package com.solid.srp.good;

import com.solid.srp.InvoiceItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ✅ FOLLOWS SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * Single Responsibility: Holds invoice domain data and performs financial subtotal/tax calculations.
 * Has ONLY ONE reason to change: Changes in business rules for invoice computation.
 */
public class Invoice {
    private final String customerEmail;
    private final double taxRate;
    private final List<InvoiceItem> items = new ArrayList<>();

    public Invoice(String customerEmail, double taxRate) {
        this.customerEmail = customerEmail;
        this.taxRate = taxRate;
    }

    public void addItem(InvoiceItem item) {
        items.add(item);
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public List<InvoiceItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (InvoiceItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public double getTaxAmount() {
        return getSubtotal() * taxRate;
    }

    public double calculateTotal() {
        return getSubtotal() + getTaxAmount();
    }
}
