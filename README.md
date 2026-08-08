# SOLID Principles
SOLID principles are the laws of physics for **OOP**.

# Overview
* **S** - Single Responsibility Principle
* **O** - Open/Closed Principle
* **L** - Liskov Substitution Principle
* **I** - Interface Segregation Principle
* **D** - Dependency Inversion Principle


# How the system follows SOLID Principles

- [x] **ISP**: Each interface is tiny and focused (Switchable, MotionDetectable, etc.)
- [x] **LSP**. Every device perfectly implements its interfaces without throwing exceptions
- [x] **SRP**: Each class has one reason to change (SmartLight only handles light logic)
- [x] **OCP**: You can add SmartThermostat without touching HomeSecuritySystem
- [x] **DIP**: HomeSecuritySystem depends on interfaces, not concrete classes

