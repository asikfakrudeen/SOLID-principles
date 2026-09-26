package com.solid.ocp.bad;

/**
 * ❌ VIOLATION OF OPEN/CLOSED PRINCIPLE (OCP)
 *
 * Why is this BAD?
 * Every time marketing introduces a new discount (e.g. SENIOR_CITIZEN, BLACK_FRIDAY),
 * you MUST MODIFY this existing, tested class by adding more if-else / switch cases!
 *
 * Risk: Modifying existing code can break existing discount rules!
 */
public class DiscountCalculatorBad {

    public double calculateDiscount(CustomerTypeBad type, double billAmount) {
        if (type == CustomerTypeBad.REGULAR) {
            return billAmount * 0.05; // 5% discount
        } else if (type == CustomerTypeBad.VIP) {
            return billAmount * 0.20; // 20% discount
        } else if (type == CustomerTypeBad.FESTIVE) {
            return billAmount * 0.15; // 15% discount
        } else if (type == CustomerTypeBad.STUDENT) {
            return billAmount * 0.10; // 10% discount
        }
        // What happens when BLACK_FRIDAY comes? We must modify this class again!
        return 0;
    }
}
