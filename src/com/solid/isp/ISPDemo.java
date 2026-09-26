package com.solid.isp;

import com.solid.isp.bad.*;
import com.solid.isp.good.*;

public class ISPDemo {
    public static void runDemo() {
        System.out.println("\n==================================================");
        System.out.println(" 4. INTERFACE SEGREGATION PRINCIPLE (ISP) DEMO");
        System.out.println("==================================================");

        // --- BAD EXAMPLE DEMO ---
        System.out.println("\n--- ❌ BEFORE (ISP Violation - Bloated Interface) ---");
        MultiFunctionDeviceBad badPrinter = new BasicPrinterBad();
        badPrinter.print("Monthly_Financial_Report.pdf");
        try {
            System.out.print("Trying to scan using basic printer: ");
            badPrinter.scan("Document.pdf");
        } catch (UnsupportedOperationException e) {
            System.out.println("\n⚠️ Caught Exception: " + e.getMessage());
        }

        // --- GOOD EXAMPLE DEMO ---
        System.out.println("\n--- ✅ AFTER (ISP Compliant - Segregated Interfaces) ---");
        System.out.println("1. Client requiring ONLY printing capabilities:");
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print("Tax_Receipt.pdf");

        System.out.println("\n2. Client requiring All-in-One capabilities:");
        SmartAllInOnePrinter workstation = new SmartAllInOnePrinter();
        workstation.print("Contract.pdf");
        workstation.scan("Passport_Scan.pdf");
        workstation.fax("Signed_Agreement.pdf");
    }
}
