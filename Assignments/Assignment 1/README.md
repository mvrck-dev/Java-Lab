# Java Calculator Program

## Overview
This project is a comprehensive calculator program implemented in Java. The program allows users to perform basic arithmetic operations, calculate the Fibonacci sequence, and find the mean and mode of an array. The program is designed to follow best coding practices and provides a user-friendly interface.

## Features
1. **Basic Arithmetic Operations**
   - Addition
   - Subtraction
   - Multiplication
   - Division (with error handling for division by zero)

2. **Fibonacci Sequence**
   - Generates the nth Fibonacci number.

3. **Array Operations**
   - Calculates the mean of a given array.
   - Finds the mode of a given array.

4. **User Input Handling**
   - Accepts single numbers or arrays from the user.
   - Allows users to select operations via a menu-driven interface.

## Program Structure
The program is divided into three Java files:

### 1. `Main.java`
- **Purpose**: Acts as the entry point for the program.
- **Responsibilities**:
  - Displays a menu for operation selection.
  - Handles user input for operation choice and delegates computation to appropriate methods in `Calculator.java`.
  - Handles program flow and ensures the program exits gracefully.

### 2. `UserInput.java`
- **Purpose**: Handles all user input.
- **Responsibilities**:
  - Provides methods to accept integer and double inputs.
  - Handles input for arrays (both integer and double).
  - Ensures valid inputs through consistent prompts.

### 3. `Calculator.java`
- **Purpose**: Contains all the core calculation methods.
- **Responsibilities**:
  - Implements arithmetic operations (add, subtract, multiply, divide).
  - Contains a recursive method for generating the Fibonacci sequence.
  - Calculates statistical measures like mean and mode.
  - Uses error handling for edge cases (e.g., division by zero).

## Folder Structure
```
Assignment 1/
│   ├── Main.java          # Entry point for the program
│   ├── UserInput.java     # Handles user inputs
│   ├── Calculator.java    # Contains all the core calculation methods
│   ├── README.md              # Project documentation (this file)
├──
```
