package com.solid.ocp.good;

public class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.05; // 5% discount
    }

    @Override
    public String getDiscountName() {
        return "Regular Customer (5%)";
    }
}
