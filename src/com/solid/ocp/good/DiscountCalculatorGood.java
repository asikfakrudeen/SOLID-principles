package com.solid.ocp.good;

/**
 * ✅ FOLLOWS OPEN/CLOSED PRINCIPLE (OCP)
 *
 * Closed for modification: This class will NEVER need to change when a new discount type is added.
 * Open for extension: Simply pass any implementation of DiscountStrategy.
 */
public class DiscountCalculatorGood {

    public double calculateFinalAmount(double originalAmount, DiscountStrategy discountStrategy) {
        double discount = discountStrategy.applyDiscount(originalAmount);
        System.out.printf("Applied Strategy: %-30s | Discount: -$%.2f | Final: $%.2f%n",
                discountStrategy.getDiscountName(), discount, (originalAmount - discount));
        return originalAmount - discount;
    }
}
