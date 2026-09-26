package com.solid.dip.good;

/**
 * ✅ FOLLOWS DEPENDENCY INVERSION PRINCIPLE (DIP)
 *
 * Abstraction that both high-level and low-level modules depend upon.
 */
public interface MessageService {
    void sendMessage(String recipient, String message);
}
