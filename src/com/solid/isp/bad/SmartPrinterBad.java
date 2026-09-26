package com.solid.isp.bad;

public class SmartPrinterBad implements MultiFunctionDeviceBad {

    @Override
    public void print(String document) {
        System.out.println("[SMART PRINTER] Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("[SMART PRINTER] Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("[SMART PRINTER] Faxing: " + document);
    }
}
