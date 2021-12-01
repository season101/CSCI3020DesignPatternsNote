# CSCI3020 Design Patterns Note

CSCI 3020 Final Exam Review Notes

## A. Principles

### 1 Principles of Code Design

#### 1.1 Coupling and Cohesion

**Coupling**: Coupling is the measure of the degree of interdependence between the software modules.

- Tight Coupling is used to describe just how much an outside class can get into another class’s members.
- Loose coupling is used to describe just how much access an outside class has to another class with a well designed API.

**Cohesion**: Cohesion is measure of the degree to which the elements of software modules belong together.

> A good software will have LOW Coupling and HIGH Cohesion.

[Good Reference on this one Source: *Stackoverflow*](https://stackoverflow.com/questions/3085285/difference-between-cohesion-and-coupling)

Cited:

```
Cohesion refers to what the class (or module) can do. Low cohesion would mean that the class does a great variety of actions - it is broad, unfocused on what it should do. High cohesion means that the class is focused on what it should be doing, i.e. only methods relating to the intention of the class.

Example of Low Cohesion:

-------------------
| Staff           |
-------------------
| checkEmail()    |
| sendEmail()     |
| emailValidate() |
| PrintLetter()   |
-------------------
Example of High Cohesion:

----------------------------
| Staff                   |
----------------------------
| -salary                 |
| -emailAddr              |
----------------------------
| setSalary(newSalary)    |
| getSalary()             |
| setEmailAddr(newEmail)  |
| getEmailAddr()          |
----------------------------

As for coupling, it refers to how related or dependent two classes/modules are toward each other. For low coupled classes, changing something major in one class should not affect the other. High coupling would make it difficult to change and maintain your code; since classes are closely knit together, making a change could require an entire system revamp.

Good software design has high cohesion and low coupling.
```

#### 1.2 Keep It Simple, Stupid (KISS)

> It was Albert Einstein who said; “If you can’t explain it, you don’t understand it well enough.” Though it is often mis-reported as being; “If you can’t explain it to a six year old, you don’t understand it well enough.” What Einstein was driving at was a particular application of “keep it simple, stupid”.

#### 1.3 Don't Repeat Yourself (DRY) Code

Reduce Repition of the code. It is useful in multi-tier Architecture.

Advantage of DRY

- Reuse your code, don't duplicate it.
- Assign Clear Names
- Choose Right Location
- Maintain "single source of truth" : Change once and Test once.
- Note: Do not confuse with abstraction, it's different

#### 1.4 Composition over Inheritance

Composition helps us reduce the unwanted effect by allowing the uninteded methods that can be accessed in contrast to Inheritance.

#### 1.5 You Aren't going to Need It (YAGNI)

 The principle states: "Always implement things when you actually need them, never when you just foresee that you may need them."

#### 1.6 Document Your Code

Code documentation is text that accompanies software code to explain what your code is doing, why it's written the way it is, and/or how to use it. There are two main categories of documentation: documentation inside the code and supporting documentation about the code.

#### 1.7 Refactor

Code refactoring is the process of restructuring existing computer code—changing the factoring—without changing its external behavior. Refactoring is intended to improve the design, structure, and/or implementation of the software, while preserving its functionality.


### 2 Principles of Object Oriented Design

**SOLID PRINCIPLE** stands for:

- 1. SRP (Single Responsibility principle)
- 2. OCP (Open Close Principle)
- 3. LSP (Liskov Substitution Principle)
- 4. ISP (Interface Segregation Principle)
- 5. DIP (Dependency Inversion Principle)

[Good resource on this one](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)

---

### Some Important Design Patterns

#### I. Creational Design Pattern

**Singleton Design Pattern**

![Singleton Desing Pattern](/src/SingletonUML.jpg)

This design pattern insures that we only have one instance of the class in the code.

In Gang of Four(GoF) this has been described as:

```
--------------------------
|       Singleton        |
--------------------------
| - instance: Singleton  |  <- static variable
--------------------------
| - Singleton()          |
| getInstance()          |  <- static method
--------------------------
```

**Note**:

- Make Constructor Private
- We make the instance variable to hold the instance of the Singleton Class. It should be made static.

- We need to make static getInstance() method that returns that static instance of the class stored in the static variable *instance*.
  
#### II. Strucrural Design Pattern

**Bridge Design Pattern**

![Singleton Desing Pattern](/src/BridgeUML.jpg)


**Facade Design Pattern**

![Singleton Desing Pattern](/src/FacadeUML.jpg)


#### III. Behavioral Design Pattern

**State Design Pattern**

![Singleton Desing Pattern](/src/StateUML.jpg)
