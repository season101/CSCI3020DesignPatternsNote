# CSCI3020 Design Patterns Note

CSCI 3020 Final Exam Review Notes

## A. Principles

### 1 Principles of Code Design

#### 1.1 Coupling and Cohesion

**Coupling**: Coupling is the measure of the degree of interdependence between the software modules.

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

#### 1.3 Don't Repeat Yourself (DRY) Code

#### 1.4 Composition over Inheritance

#### 1.5 You Aren't going to Need It (YAGNI)

#### 1.6 Document Your Code

#### 1.7 Refactor
