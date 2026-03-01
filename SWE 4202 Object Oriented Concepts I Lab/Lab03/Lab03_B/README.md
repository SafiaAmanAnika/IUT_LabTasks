# 🍽️ Restaurant Management System

This Java project is a simple simulation of a restaurant system built using core Object-Oriented Programming (OOP) principles. It models real-world entities like customers and different types of staff using classes, inheritance, encapsulation, and polymorphism.

---

## 🧠 Concepts Covered

- **Class & Object**
- **Encapsulation** (with attributes and methods)
- **Inheritance** (`Customer`, `Staff`, and its subclasses inherit from `Person`)
- **Method Overriding**
- **Polymorphism** (objects accessed via parent class references)
- **Simple Console Outputs for Testing**

---

## 🏗️ Class Structure

- `Person` — Base class with common attributes (`name`, `address`, `mobileNo`)
- `Customer` — Inherits from `Person`, handles reservations and preferences
- `Staff` — Abstract staff role; extended by:
  - `CookingStaff` — Handles cooking and cleaning dishes
  - `WaitingStaff` — Takes orders, suggests wine
  - `CleaningStaff` — Cleans the restaurant
- `Restaurant` — Main class to create and test all objects
