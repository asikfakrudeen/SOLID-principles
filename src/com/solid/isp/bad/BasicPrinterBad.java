package com.solid.isp.bad;

/**
 * Basic printer forced to implement methods it cannot support.
 */
public class BasicPrinterBad implements MultiFunctionDeviceBad {

    @Override
    public void print(String document) {
        System.out.println("[BASIC PRINTER] Printing: " + document);
    }

    @Override
    public void scan(String document) {
        // Forced to implement!
        throw new UnsupportedOperationException("BasicPrinter cannot scan!");
    }

    @Override
    public void fax(String document) {
        // Forced to implement!
        throw new UnsupportedOperationException("BasicPrinter cannot fax!");
    }
}
