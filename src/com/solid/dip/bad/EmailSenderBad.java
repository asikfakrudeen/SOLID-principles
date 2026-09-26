package com.solid.dip.bad;

/**
 * Concrete low-level module.
 */
public class EmailSenderBad {
    public void sendEmail(String to, String body) {
        System.out.println("[EMAIL HARDCODED] Sending email to " + to + ": " + body);
    }
}
