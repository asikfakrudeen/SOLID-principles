# 🚀 Master SOLID Principles in Java

Welcome to the ultimate, beginner-to-advanced practical study guide for **SOLID Principles** in Java.

> *"Write code that is easy to change, easy to test, and easy to maintain till your last breath."*

---

## 📌 Quick Summary Table

| Letter | Principle | Core Concept | Real-World Analogy | Memory Hook |
|---|---|---|---|---|
| **S** | **Single Responsibility Principle (SRP)** | A class should have only **one reason to change**. | Swiss Army Knife vs Specialized Tools | *"One class, one job."* |
| **O** | **Open/Closed Principle (OCP)** | Open for **extension**, closed for **modification**. | Smartphone Apps (plug-and-play extensions) | *"Plug in new code, don't chop old code."* |
| **L** | **Liskov Substitution Principle (LSP)** | Subtypes must be **substitutable** for base types without breaking correctness. | Rubber Duck Trap (If it needs batteries, it's not just a duck) | *"Subclasses shouldn't lie about their capabilities."* |
| **I** | **Interface Segregation Principle (ISP)** | Clients shouldn't be forced to depend on interfaces they **don't use**. | 100-Button Remote Control vs Simple TV Remote | *"Small, laser-focused interfaces over monolithic ones."* |
| **D** | **Dependency Inversion Principle (DIP)** | High-level modules & Low-level modules should depend on **abstractions**, not concretions. | Wall Power Socket (Laptop charger plugs into socket interface, not raw grid wires) | *"Depend on Abstractions, Inject Dependencies."* |

---

## 🛠️ Project Structure

```
SOLID principles/
├── src/
│   └── com/
│       └── solid/
│           ├── srp/    # Single Responsibility Principle (Invoice example)
│           ├── ocp/    # Open/Closed Principle (Discount strategy example)
│           ├── lsp/    # Liskov Substitution Principle (Bird/Flyable example)
│           ├── isp/    # Interface Segregation Principle (Printer/Scanner example)
│           ├── dip/    # Dependency Inversion Principle (Notification service example)
│           └── Main.java # Master runner executing all 5 demonstrations
└── README.md
```

---

## ⚡ How to Compile and Run

Make sure Java JDK 8+ is installed on your system.

### 1. Compile the project:
```bash
javac -encoding UTF-8 -d bin (Get-ChildItem -Path src -Recurse -Filter "*.java" | Select-Object -ExpandProperty FullName)
```

### 2. Execute the Master Runner:
```bash
java -cp bin com.solid.Main
```

---

## 📚 Deep-Dive Breakdown of Each Principle

### 1️⃣ Single Responsibility Principle (SRP)
- **Problem**: `InvoiceBad` handles calculation, console printing, database insertion, and email notifications. Changing database schemas or email templates breaks invoice calculation code.
- **Solution**: Split into:
  - `Invoice`: Financial calculations only.
  - `InvoicePrinter`: Report printing format.
  - `InvoiceRepository`: DB SQL persistence.
  - `EmailNotificationService`: Email transmission.

### 2️⃣ Open/Closed Principle (OCP)
- **Problem**: `DiscountCalculatorBad` uses an `if-else` chain checking customer enums (`REGULAR`, `VIP`, `FESTIVE`). Adding a `BLACK_FRIDAY` discount forces modifying tested core logic.
- **Solution**: Use the **Strategy Pattern**. `DiscountCalculatorGood` takes a `DiscountStrategy` interface. Adding `BlackFridayDiscount` is done purely by creating a new class without altering existing ones.

### 3️⃣ Liskov Substitution Principle (LSP)
- **Problem**: `OstrichBad` extends `BirdBad`. Calling `fly()` on `OstrichBad` throws `UnsupportedOperationException`, breaking code that iterates through `BirdBad` instances.
- **Solution**: Separate general bird behavior (`Bird` has `eat()`, `walk()`) from flying behavior (`Flyable` interface). Only flying birds (`Sparrow`) implement `Flyable`.

### 4️⃣ Interface Segregation Principle (ISP)
- **Problem**: `MultiFunctionDeviceBad` interface forces `BasicPrinterBad` to implement `scan()` and `fax()`, throwing runtime exceptions.
- **Solution**: Split into small, segregated interfaces: `Printer`, `Scanner`, `FaxMachine`. A `SimplePrinter` implements only `Printer`, while a `SmartAllInOnePrinter` implements all three.

### 5️⃣ Dependency Inversion Principle (DIP)
- **Problem**: `NotificationServiceBad` hardcodes `new EmailSenderBad()` inside its constructor. You cannot send SMS/Push or unit test without sending real emails.
- **Solution**: `NotificationServiceGood` depends on the `MessageService` interface. Concrete implementations (`EmailService`, `SMSService`, `PushNotificationService`) are injected via constructor.

---

## 🎯 Final Words & Memory Trick

To remember SOLID forever:
- **S** -> **S**ingle Job per class
- **O** -> **O**nly add new code, don't modify old code
- **L** -> **L**ike-for-like substitution (Subclasses must honor parent promises)
- **I** -> **I**nterfaces should be slim & fit
- **D** -> **D**epend on Interfaces, not concrete implementations
