package com.solid.lsp.good;

public class Ostrich extends Bird {
    public Ostrich() {
        super("Ostrich");
    }

    public void runFast() {
        System.out.println(getName() + " is sprinting at 70 km/h!");
    }
}
