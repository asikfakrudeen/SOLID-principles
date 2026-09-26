package com.solid;

import com.solid.srp.SRPDemo;
import com.solid.ocp.OCPDemo;
import com.solid.lsp.LSPDemo;
import com.solid.isp.ISPDemo;
import com.solid.dip.DIPDemo;

/**
 * MASTER DEMONSTRATION RUNNER FOR SOLID PRINCIPLES IN JAVA
 *
 * Run this class to view executable side-by-side output of BAD vs GOOD software design choices.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================================================");
        System.out.println("           MASTER STUDY GUIDE & DEMONSTRATION: SOLID PRINCIPLES           ");
        System.out.println("==========================================================================");

        SRPDemo.runDemo();
        OCPDemo.runDemo();
        LSPDemo.runDemo();
        ISPDemo.runDemo();
        DIPDemo.runDemo();

        System.out.println("\n==========================================================================");
        System.out.println("      🎉 ALL 5 SOLID PRINCIPLES DEMONSTRATED AND EXECUTED CLEANLY!       ");
        System.out.println("==========================================================================");
    }
}
