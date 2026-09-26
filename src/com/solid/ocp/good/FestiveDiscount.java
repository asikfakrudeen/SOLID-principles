package com.solid.ocp.good;

public class FestiveDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.15; // 15% discount
    }

    @Override
    public String getDiscountName() {
        return "Festive Offer (15%)";
    }
}
