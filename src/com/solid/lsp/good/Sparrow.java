package com.solid.lsp.good;

public class Sparrow extends Bird implements Flyable {
    public Sparrow() {
        super("Sparrow");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying gracefully in the sky!");
    }
}
