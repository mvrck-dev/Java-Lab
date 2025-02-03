# Array and ArrayList Operations in Java

## Overview
This project demonstrates various **array** and **ArrayList** operations using Java. The program allows users to:
1. **Separate even and odd numbers** from user input.
2. **Find two adjacent numbers with the smallest difference** in an array.
3. **Convert an array into an `ArrayList` and vice versa**.

The program is structured into multiple Java files, each handling a specific functionality, following best coding practices.

---

## Features
1. **Even and Odd Number Separation**
   - Accepts numbers from the user.
   - Categorizes numbers into separate lists: **even** and **odd**.

2. **Finding Smallest Distance Between Adjacent Numbers**
   - Identifies two consecutive numbers in an array with the smallest absolute difference.
   - Returns the index of the first number.

3. **Array to ArrayList Conversion & Vice Versa**
   - Converts a given array to an `ArrayList`.
   - Converts an `ArrayList` back into an array.

4. **User Input Handling**
   - Uses a **menu-driven interface** for operation selection.
   - Ensures valid input and handles exceptions.

---

## Program Structure
The project is divided into four Java files:

### 1. `Main.java`
- **Purpose**: Serves as the entry point for the program.
- **Responsibilities**:
  - Provides a menu-driven interface for users to select operations.
  - Calls respective methods in other classes.
  - Ensures proper user interaction and error handling.

### 2. `EvenOddSeparator.java`
- **Purpose**: Separates user-inputted numbers into even and odd categories.
- **Responsibilities**:
  - Accepts a list of numbers from the user.
  - Stores even numbers in one list and odd numbers in another.
  - Displays categorized numbers.

### 3. `SmallestDistanceFinder.java`
- **Purpose**: Finds the index of two adjacent numbers with the smallest absolute difference.
- **Responsibilities**:
  - Takes an array of numbers.
  - Iterates through the array to find the closest pair.
  - Returns the index of the first number in that pair.

### 4. `ArrayConverter.java`
- **Purpose**: Handles conversion between arrays and `ArrayList`.
- **Responsibilities**:
  - Converts a given array into an `ArrayList`.
  - Converts an `ArrayList` back into an array.
  - Demonstrates both operations with sample data.

---

## Folder Structure
├── ArrayConverter.java
├── EvenOddSeparator.java
├── Main.java
├── README.md
└── SmallestDistanceFinder.java

