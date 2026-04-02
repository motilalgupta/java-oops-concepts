# Java OOPs Concepts 🚀

This repository contains my practice and implementation of **Object-Oriented Programming (OOP) concepts in Java**.  
It includes simple examples to understand core principles used in real-world applications.

---

## 📌 Topics Covered

- Classes and Objects  
- Inheritance  
- Polymorphism  
- Abstraction  
- Encapsulation  
- Interfaces  

---

## 🧠 What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects**, which contain data (fields) and methods (functions).  
It helps in writing clean, reusable, and maintainable code.

---

## ⚙️ Core Concepts

### 1. Encapsulation
- Wrapping data and methods into a single unit (class)  
- Achieved using private variables and public getters/setters  

### 2. Inheritance
- One class acquires properties of another  
- Promotes code reuse  

### 3. Polymorphism
- One interface, multiple implementations  
- Example: Method Overloading & Overriding  

### 4. Abstraction
- Hiding implementation details  
- Achieved using abstract classes and interfaces  

### 5. Interface
- Blueprint of a class  
- Supports multiple inheritance in Java  

---

## 📂 Project Structure


src/
class-object/
inheritance/
polymorphism/
abstraction/
encapsulation/
interface/


---

## 💻 Example

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
🚀 How to Run
Clone the repository
Open in IntelliJ IDEA
Navigate to any class
Run the main method
🎯 Purpose

This repository is created to:

Practice OOP concepts in Java
Strengthen programming fundamentals
Prepare for coding interviews
📌 Future Improvements
Add real-world examples
Add interview questions
Add notes for quick revision
⭐ Support

If you find this helpful, consider giving it a star ⭐

👨‍💻 Author

Motilal Gupta
