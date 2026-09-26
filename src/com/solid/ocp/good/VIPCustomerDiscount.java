package com.solid.ocp.good;

public class VIPCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.20; // 20% discount
    }

    @Override
    public String getDiscountName() {
        return "VIP Customer (20%)";
    }
}
