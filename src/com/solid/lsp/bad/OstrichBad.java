package com.solid.lsp.bad;

/**
 * ❌ VIOLATION OF LISKOV SUBSTITUTION PRINCIPLE (LSP)
 *
 * Ostrich IS-A Bird, but it CANNOT fly!
 * By throwing an exception when substituted for BirdBad, it breaks caller expectations and program correctness.
 */
public class OstrichBad extends BirdBad {
    public OstrichBad() {
        super("Ostrich");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("CRASH! Ostriches cannot fly! LSP violated!");
    }
}
