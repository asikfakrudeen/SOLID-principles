package com.solid.ocp.good;

/**
 * Extension created WITHOUT touching any existing files!
 * Demonstrates Open for Extension.
 */
public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.50; // 50% discount
    }

    @Override
    public String getDiscountName() {
        return "Black Friday Super Sale (50%)";
    }
}
