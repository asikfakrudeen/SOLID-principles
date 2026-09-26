package com.solid.isp.bad;

/**
 * ❌ VIOLATION OF INTERFACE SEGREGATION PRINCIPLE (ISP)
 *
 * Why is this BAD?
 * This is a "FAT" interface. It forces ALL implementers to support Print, Scan, and Fax,
 * even if a simple desktop printer only supports printing!
 * BasicPrinterBad is forced to write empty/exception stubs for scan() and fax().
 */
public interface MultiFunctionDeviceBad {
    void print(String document);
    void scan(String document);
    void fax(String document);
}
