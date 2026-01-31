 Assignment 4 – SOLID Library System (Simple Version)
 Project Description

This project is a **Library Management System** created for **Assignment 4**.
The goal is to show **SOLID principles**, **OOP**, and **clean architecture** in a simple way.

---

Project Structure

```
controller → service → repository → database
```

* **Controller** – user input only
* **Service** – business logic, validation, exceptions
* **Repository** – CRUD with JDBC
* **Database** – tables with relations

---

 SOLID Principles

* **SRP** – one class = one responsibility
* **OCP** – new classes added without changing old code
* **LSP** – subclasses work correctly as parent type
* **ISP** – small interfaces
* **DIP** – service depends on interfaces

---

OOP Features

* Abstract class: `LibraryItem`
* Subclasses: `Book`, `Magazine`
* Composition: `Book → Category`
* Polymorphism through base class

---

 Advanced Java

* Interfaces with default/static methods
* Generics (`CrudRepository<T>`)
* Lambdas for sorting
* Reflection for class inspection

---


 How to Run

1. Open project in IntelliJ IDEA
2. Set database connection
3. Run `schema.sql`
4. Run `Main.java`

---

What I Learned

* How SOLID improves code quality
* Clean layered architecture
* Practical OOP in Java
