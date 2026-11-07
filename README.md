# Student Management System

A Java-based console application designed to manage student records efficiently using Object-Oriented Programming concepts.

## About the Project

The Student Management System allows users to perform basic operations on student records through a menu-driven interface. It provides functionality to add, display, search, update, and delete student information.

## Features

- Add new student records.
- Display all student records.
- Search for a student using Student ID.
- Update student marks.
- Delete student records.
- Validate duplicate Student IDs.
- Menu-driven user interaction.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- ArrayList
- Scanner for user input

## Project Structure

```text
Student-Management-System/
│
└── src/
    ├── main/
    │   └── Main.java
    │
    ├── model/
    │   └── Student.java
    │
    ├── service/
    │   └── StudentService.java
    │
    └── util/
        └── InputUtil.java
```

## How to Run the Project

### Prerequisites
- Java JDK installed.
- VS Code or any Java-supported IDE.

### Compilation

Open the terminal in the project directory and execute:

```bash
javac -d out src/main/Main.java src/model/Student.java src/service/StudentService.java src/util/InputUtil.java
```

### Execution

```bash
java -cp out main.Main
```

## Application Menu

```text
===== Student Management System =====

1. Add Student
2. Display Students
3. Search Student
4. Update Student Marks
5. Delete Student
6. Exit

Enter Choice:
```

## Concepts Practiced

- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- Packages and Imports
- ArrayList
- Loops and Conditional Statements
- Switch Statement
- Methods

## Author

**Anuf Shaik**

GitHub: [AnufShaik](https://github.com/AnufShaik)

