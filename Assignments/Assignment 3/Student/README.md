# Java Calculator Program

## Overview
This project is a comprehensive calculator program implemented in Java. The program allows users to perform basic arithmetic operations, calculate the Fibonacci sequence, and find the mean and mode of an array. It is designed with best coding practices in mind and provides a user-friendly, menu-driven interface.

## Features
1. **Basic Arithmetic Operations**
   - Addition
   - Subtraction
   - Multiplication
   - Division (with error handling for division by zero)

2. **Fibonacci Sequence**
   - Generates the nth Fibonacci number using recursion.

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
  - Handles user input for operation choice.
  - Delegates computations to appropriate methods in `Calculator.java`.
  - Manages program flow and ensures a graceful exit.

### 2. `UserInput.java`
- **Purpose**: Handles all user input.
- **Responsibilities**:
  - Provides methods to accept integer and double inputs.
  - Manages input for arrays (both integer and double).
  - Validates user inputs and ensures consistent prompts.

### 3. `Calculator.java`
- **Purpose**: Contains all core calculation methods.
- **Responsibilities**:
  - Implements arithmetic operations (addition, subtraction, multiplication, division).
  - Implements a recursive method to generate the Fibonacci sequence.
  - Provides methods to calculate statistical measures such as mean and mode.
  - Handles errors and edge cases (e.g., division by zero).


