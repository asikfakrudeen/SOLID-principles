package com.solid.srp;

/**
 * Simple data transfer model representing an line item in an invoice.
 */
public class InvoiceItem {
    private final String name;
    private final int quantity;
    private final double pricePerUnit;

    public InvoiceItem(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}
