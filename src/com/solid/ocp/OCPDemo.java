package com.solid.ocp;

import com.solid.ocp.bad.CustomerTypeBad;
import com.solid.ocp.bad.DiscountCalculatorBad;
import com.solid.ocp.good.*;

public class OCPDemo {
    public static void runDemo() {
        System.out.println("\n==================================================");
        System.out.println(" 2. OPEN/CLOSED PRINCIPLE (OCP) DEMO");
        System.out.println("==================================================");

        double billAmount = 1000.00;

        // --- BAD EXAMPLE DEMO ---
        System.out.println("\n--- ❌ BEFORE (OCP Violation - Tight Coupling with if-else) ---");
        DiscountCalculatorBad badCalculator = new DiscountCalculatorBad();
        System.out.println("VIP Discount: $" + badCalculator.calculateDiscount(CustomerTypeBad.VIP, billAmount));
        System.out.println("Festive Discount: $" + badCalculator.calculateDiscount(CustomerTypeBad.FESTIVE, billAmount));
        System.out.println("⚠️ Adding Black Friday required altering DiscountCalculatorBad source code!");

        // --- GOOD EXAMPLE DEMO ---
        System.out.println("\n--- ✅ AFTER (OCP Compliant - Polymorphic Strategy Pattern) ---");
        DiscountCalculatorGood goodCalculator = new DiscountCalculatorGood();

        goodCalculator.calculateFinalAmount(billAmount, new RegularCustomerDiscount());
        goodCalculator.calculateFinalAmount(billAmount, new VIPCustomerDiscount());
        goodCalculator.calculateFinalAmount(billAmount, new FestiveDiscount());

        // New discount added seamlessly without modifying existing classes!
        goodCalculator.calculateFinalAmount(billAmount, new BlackFridayDiscount());
    }
}
