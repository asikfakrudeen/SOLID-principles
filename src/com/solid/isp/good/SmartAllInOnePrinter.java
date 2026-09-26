package com.solid.isp.good;

/**
 * All-in-one workstation implements multiple small interfaces as needed via Interface Segregation.
 */
public class SmartAllInOnePrinter implements Printer, Scanner, FaxMachine {
    @Override
    public void print(String document) {
        System.out.println("[SMART ALL-IN-ONE] Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("[SMART ALL-IN-ONE] High-resolution Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("[SMART ALL-IN-ONE] Digital Faxing: " + document);
    }
}
