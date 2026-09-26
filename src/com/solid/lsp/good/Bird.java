package com.solid.lsp.good;

/**
 * ✅ FOLLOWS LISKOV SUBSTITUTION PRINCIPLE (LSP)
 *
 * Base class containing only behaviors true for ALL birds.
 */
public abstract class Bird {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating food.");
    }

    public void walk() {
        System.out.println(name + " is walking on ground.");
    }
}
