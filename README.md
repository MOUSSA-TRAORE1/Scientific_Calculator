# Programmer Calculator

## Calculator Interface
.....

## Description

Programmer Calculator is a Java Swing desktop application designed for arithmetic and programmer-oriented calculations. The calculator supports Decimal, Binary, and Hexadecimal number systems and includes both arithmetic and bitwise logical operations.

The project demonstrates Java GUI development using Swing, event handling, number system conversion, and logical computation.

---

## Features

### Number System Modes
- Decimal Mode
- Binary Mode
- Hexadecimal Mode

### Arithmetic Operations
- Addition (+)
- Subtraction (-)
- Multiplication (x)
- Division (/)

### Bitwise Operations
- AND
- OR
- XOR
- NOT
- Left Shift (<<)
- Right Shift (>>)

### GUI Features
- Interactive Java Swing interface
- Dynamic button enabling/disabling depending on mode
- Clear button
- Error handling for invalid inputs
- Read-only display field

---

## Technologies Used

- Java
- Java Swing
- AWT Event Handling

---

## Supported Inputs

### Decimal Mode
```text
0-9
```

### Binary Mode
```text
0 and 1 only
```

### Hexadecimal Mode
```text
0-9 and A-F
```

---

## Project Structure

```text
ProgrammerCalculator/
│
├── src/
│   └── Calculator.java
│
├── README.md
└── .gitignore
```

---

## How to Run

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Locate:

```text
Calculator.java
```

3. Run the file

---

### Using Terminal

Compile:

```bash
javac Calculator.java
```

Run:

```bash
java Calculator
```

---

## Example Operations

### Decimal Addition

```text
10 + 5 = 15
```

### Binary AND

```text
1010 AND 1100 = 1000
```

### Hexadecimal Addition

```text
A + F = 19
```

### Bitwise NOT

```text
NOT 1010
```

---

## Functional Overview

The calculator changes available buttons dynamically based on the selected number system:

- Binary mode enables only:
  - 0
  - 1

- Decimal mode enables:
  - 0-9

- Hexadecimal mode enables:
  - 0-9
  - A-F

The application converts inputs internally and displays results according to the currently selected number system.

---

## Error Handling

The calculator handles:
- Invalid input formats
- Division by zero
- Empty operations
- Incorrect number conversions

When an invalid operation occurs:

```text
Error
```

is displayed.

---

## Learning Objectives

This project demonstrates:
- Java Swing GUI programming
- Event-driven programming
- Object-oriented programming
- Bitwise operations
- Number system conversions
- User interface design
- Input validation and error handling

---

## Future Improvements

Possible future enhancements:
- Scientific functions
- Floating-point hexadecimal support
- Keyboard input support
- Operation history
- Memory functions
- Dark mode UI
- Expression parsing

---

## Author

MOUSSA TRAORE

Computer Engineering Student  
Antalya Bilim University

---
