# ✌️Friends' Activities

## 1.1 Background

This project  aims to model a group of friends using Java by applying core object-oriented programming (OOP) principles such as **inheritance**, **encapsulation**, and **abstraction**.

---

## 1.2 Task Description

- Design a `Person` class that represents common attributes and behaviors of individuals.
- Create specialized subclasses for friends:
  - `Programmer` for Raiyan
  - `Dancer` for Tahsin
  - `Singer` for Anika
- All individuals:
  - Live in Dhaka
  - Are the same age
  - Can eat, sleep, walk, and learn
- Specific behaviors:
  - Raiyan codes for a company as a Junior Software Engineer.
  - Tahsin dances in festivals as part of a group in a dance academy.
  - Anika sings and plays guitar as the lead vocalist of a band.
- Demonstrate encapsulation by keeping attributes private and using getters/setters.
- Use a `MainClass` to:
  - Instantiate objects of all classes
  - Call both shared and unique methods
  - Print distinct outputs for each friend’s activity

---

## 1.3 Classes and Functionalities

### `Person` Class
- **Attributes**:
  - `name`
  - `age`
  - `city`
- **Methods**:
  - `eat()`
  - `sleep()`
  - `walk()`
  - `learn()`
- **Encapsulation**:
  - All attributes are private
  - Accessed via public getters and setters

---

### `Programmer` Class *(extends Person)*
- **Additional Attributes**:
  - `company`
  - `position`
- **Method**:
  - `code()`

---

### `Dancer` Class *(extends Person)*
- **Additional Attributes**:
  - `groupName`
  - `academy`
- **Method**:
  - `dance()`

---

### `Singer` Class *(extends Person)*
- **Additional Attributes**:
  - `bandName`
  - `role`
- **Methods**:
  - `sing()`
  - `playGuitar()`

---

### `MainClass`
- Creates instances of `Programmer`, `Dancer`, `Singer`, and a general `Person`.
- Calls shared methods (`eat()`, `sleep()`, etc.) from the `Person` class.
- Calls specific methods (`code()`, `dance()`, `sing()`, etc.) from each subclass.
- Demonstrates polymorphism and clean OOP design.