package com.solid.lsp;

import com.solid.lsp.bad.*;
import com.solid.lsp.good.*;
import java.util.List;

public class LSPDemo {
    public static void runDemo() {
        System.out.println("\n==================================================");
        System.out.println(" 3. LISKOV SUBSTITUTION PRINCIPLE (LSP) DEMO");
        System.out.println("==================================================");

        // --- BAD EXAMPLE DEMO ---
        System.out.println("\n--- ❌ BEFORE (LSP Violation) ---");
        List<BirdBad> badBirds = List.of(new SparrowBad(), new OstrichBad());
        for (BirdBad bird : badBirds) {
            try {
                System.out.print("Commanding " + bird.getName() + " to fly: ");
                bird.fly();
            } catch (UnsupportedOperationException e) {
                System.out.println("\n⚠️ Caught Runtime Exception: " + e.getMessage());
            }
        }

        // --- GOOD EXAMPLE DEMO ---
        System.out.println("\n--- ✅ AFTER (LSP Compliant) ---");
        // All birds can eat and walk:
        List<Bird> allBirds = List.of(new Sparrow(), new Ostrich());
        System.out.println("1. General Bird Behaviors (Applies to ALL subtypes):");
        for (Bird bird : allBirds) {
            bird.eat();
            bird.walk();
        }

        // Only Flyable birds are given flight instructions:
        System.out.println("\n2. Specialized Flying Capability (Type-safe):");
        List<Flyable> flyingBirds = List.of(new Sparrow());
        for (Flyable flyer : flyingBirds) {
            flyer.fly();
        }

        System.out.println("Ostrich can sprint safely:");
        Ostrich ostrich = new Ostrich();
        ostrich.runFast();
    }
}
