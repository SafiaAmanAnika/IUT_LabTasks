# 💼 E-Commerce Order Management System

## 1.1 Background  
You are working as a Java developer for an e-commerce platform that handles product orders, shipping, and customer support. Your task is to implement part of the Order Management System that demonstrates **method overloading** and **method overriding** in a real-world context.

---

## 1.2 Task Description  

## 🏗️ Class Structure

- `Order` — Base class with overloaded methods to process general orders using order ID and priority
- `OnlineOrder` — Inherits from `Order`, overrides methods to process online-specific orders
- `InStoreOrder` — Inherits from `Order`, overrides method to handle in-store pickup orders
- `Main` — Driver class to create and test all order types using overloading and overriding

---

## 1.3 Sample Output

Processing a general order.
Processing order with ID: ORD123
Processing priority order with ID: ORD124
Processing an online order.
Processing online order with ID: ORD125
Processing an in-store pickup order.