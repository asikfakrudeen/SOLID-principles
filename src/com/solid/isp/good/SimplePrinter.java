package com.solid.isp.good;

/**
 * Simple printer depends ONLY on Printer interface.
 * Clean, focused, zero dummy methods or runtime exceptions!
 */
public class SimplePrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("[SIMPLE PRINTER] Printing: " + document);
    }
}
