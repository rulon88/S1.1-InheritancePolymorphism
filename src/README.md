# Level 1 – Java OOP Exercises

## Introduction
In this level we are practicing the basic ideas of **Object-Oriented Programming (OOP)** in Java.  
The main topics are **inheritance, polymorphism, abstract classes, static fields, and final constants**.  
Each exercise is a small console program that shows how these concepts work in practice.

---

## Exercise 1 – Musical Instruments
In this exercise we build a simple model of musical instruments:

- An abstract class `Instrument` with the attributes `name` and `price`.
- Three subclasses:
    - `WindInstrument`
    - `StringInstrument`
    - `PercussionInstrument`

Each subclass overrides the abstract method `play()`, so the same method name produces different results depending on the type of instrument.  
This demonstrates **inheritance** (all instruments share common attributes) and **polymorphism** (the same method works in different ways).

---

## Exercise 2 – Car
In this exercise we focus on the use of **static** and **final**:

- The class `Car` has attributes with different behaviors:
    - `brand` → `static final` (a constant for all cars).
    - `model` → `static` (shared, one value for all cars).
    - `power` → `final` (unique per car, cannot change once created).

There are also simple methods to accelerate and brake.  
This exercise demonstrates the difference between **instance attributes**, **shared static attributes**, and **final constants**.

---
