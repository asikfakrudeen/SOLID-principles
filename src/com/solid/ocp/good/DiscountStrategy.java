package com.solid.ocp.good;

/**
 * ✅ FOLLOWS OPEN/CLOSED PRINCIPLE (OCP)
 *
 * Abstraction for discount algorithms.
 * Allows adding endless new discount strategies without modifying existing code.
 */
public interface DiscountStrategy {
    double applyDiscount(double amount);
    String getDiscountName();
}
