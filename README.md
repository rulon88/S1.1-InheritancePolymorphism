# S1.1-InheritancePolymorphism

🎶 **Java OOP Exercises – Musical Instruments, Vehicles, Smartphones & Newsroom**

---

## 📝 Description
This repository contains the resolution of the **S1.1 Inheritance & Polymorphism** exercises from the Java fundamentals module at IT Academy.  
The exercises are structured in levels and demonstrate core Object-Oriented Programming (OOP) principles in Java such as:

- Inheritance  
- Polymorphism  
- Abstract classes  
- Interfaces  
- Static fields and methods  
- Final constants  

All exercises are simple console applications meant to illustrate OOP concepts in practice.  

Use **Eclipse** or **IntelliJ IDEA** for all exercises.  
Follow the best practices from Sprint 0 for GitHub deliveries.  
Projects can be built with **plain Java**, **Maven**, or **Gradle**.  
All code is written in **English**.  

---

## 🎯 Objectives
- Understand and apply the fundamentals of OOP in Java.  
- Practice inheritance, polymorphism, encapsulation, and abstraction.  
- Learn the difference between `static` attributes/methods and instance ones.  
- Use interfaces to define contracts and implement them in classes.  

---

## 📚 Exercise Overview

### Level 1
#### Exercise 1 – Musical Instruments
- Abstract class `Instrument` with attributes `name` and `price`.  
- Subclasses: `WindInstrument`, `StringInstrument`, `PercussionInstrument`.  
- Each overrides the abstract method `play()`.  
- Demonstrates **inheritance** (shared attributes) and **polymorphism** (different behaviors with the same method).

#### Exercise 2 – Car Class
- Class `Car` with attributes:
  - `brand` → `static final` (constant for all cars).  
  - `model` → `static` (shared, one value for all cars).  
  - `horsepower` → `final` (unique per car, cannot be changed after creation).  
- Methods:
  - `accelerate()` → static.  
  - `brake()` → static.  
- Demonstrates **difference between instance attributes, static attributes, and final constants**.

---

### Level 2
#### Exercise 1 – Smartphone
- **Class `Phone`**: attributes `brand` and `model`, and method `call(String number)`.  
- **Interface `Camera`**: method `takePhoto()`.  
- **Interface `Clock`**: method `alarm()`.  
- **Class `Smartphone`**:
  - Extends `Phone`.  
  - Implements `Camera` and `Clock`.  
  - Provides specific implementations for `takePhoto()` and `alarm()`.  

Example: from `main()` create a `Smartphone` and call its methods.  

---

### Level 3
#### Exercise 1 – Newsroom System
- **Journalist**: attributes `name`, `DNI` (immutable), and `salary` (shared by all).  
- **News Articles**: base class `News` with headline, text, score, and price.  
- Subclasses for different sports (`Football`, `Basketball`, `Tennis`, `F1`, `Motorcycling`) with specific attributes.  
- **Price and score calculations** vary depending on the type and context.  
- Includes a **menu system** to add/remove journalists, assign news, and calculate scores/prices.  

---

## 💻 Technologies Used
- Java JDK 21  
- IntelliJ IDEA Community Edition (or Eclipse)  
- Git & GitHub  
- (Optional) Maven or Gradle for build automation  

---

## 📋 Requirements
- **Java Development Kit (JDK 21 or higher)**  
- **Git** installed to clone the repository  
- An IDE such as IntelliJ IDEA or Eclipse  

---

## 🛠️ Installation
1. Clone the repository:  
   ```bash
   git clone https://github.com/rulon88/S1.1-InheritancePolymorphism.git



   ---

## ▶️ Execution
1. Go to the corresponding package (e.g. `level01.exercise02`).  
2. Run the `Main` class.  
3. Observe the console output for each exercise.  

---

## 🌐 Deployment
This is an educational project and is not intended for production deployment.  

However, if you wish to package and run the application as a `.jar` file, follow these steps:

```bash 
# Compile the main Java file
javac Main.java

# Package all class files into a runnable JAR named 'OOPExercises.jar'
jar cfe OOPExercises.jar Main *.class

# Execute the JAR file
java -jar OOPExercises.jar

 ```
---

## 📦 Repository
You can find the source code on GitHub:  
🔗 https://github.com/tuusuario/S1.1-InheritancePolymorphism

---

## ✅ Author Notes
This project is part of IT Academy training.  
The exercises are building blocks to strengthen OOP understanding through practice.  
Happy coding 🚀







