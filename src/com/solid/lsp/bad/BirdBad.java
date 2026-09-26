package com.solid.lsp.bad;

/**
 * ❌ VIOLATION OF LISKOV SUBSTITUTION PRINCIPLE (LSP)
 *
 * Why is this BAD?
 * Base class assumes ALL birds can fly.
 */
public class BirdBad {
    private final String name;

    public BirdBad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fly() {
        System.out.println(name + " is flying high in the sky!");
    }
}
