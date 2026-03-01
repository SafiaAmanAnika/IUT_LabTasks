# 🐾 Animal Simulator

## 1. Background  
You are a Java developer building an animal simulation system that models different animals and their behaviors. This project demonstrates **runtime polymorphism** by showing how subclasses override methods of a common superclass to produce different behaviors at runtime.

## 2. Task Description

### 🏗️ Class Structure

- `Animal` — Base class with attributes for name and habitat; provides generic methods `makeSound()` and `displayInfo()`  
- `Dog` — Inherits from `Animal`, overrides methods to simulate dog-specific sounds and info  
- `Cat` — Inherits from `Animal`, overrides methods to simulate cat-specific sounds and info  
- `Cow` — Inherits from `Animal`, overrides methods to simulate cow-specific sounds and info  
- `AnimalSimulator` — Driver class to create and test different animal objects demonstrating polymorphism  

## 3. Concepts Covered

- **Method Overriding** (subclasses provide specific implementations of `makeSound()` and `displayInfo()`)  
- **Inheritance** (Dog, Cat, Cow inherit common behavior from Animal)  
- **Runtime Polymorphism** (superclass references point to subclass objects and call overridden methods)  