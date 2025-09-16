# Level 2 – Exercise 1: Smartphone

## Description
In this exercise we practice **inheritance and interfaces** in Java.  
A smartphone is modeled as a class that extends another class and implements multiple interfaces.

---

## Structure
- **Class `Phone`**:  
  Attributes `brand` and `model`, and a method `call(String number)`.

- **Interface `Camera`**:  
  Method `takePhoto()`.

- **Interface `Clock`**:  
  Method `alarm()`.

- **Class `Smartphone`**:
    - Extends `Phone`.
    - Implements `Camera` and `Clock`.
    - Provides specific implementations for `takePhoto()` and `alarm()`.

---

## Example Usage
From the `main()` method we create a `Smartphone` and call its methods:

