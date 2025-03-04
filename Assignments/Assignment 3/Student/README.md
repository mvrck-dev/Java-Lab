# Student Management System - Detailed README

This Java program implements a basic Student Management System, providing functionalities to manage student records effectively.

## Project Overview

The system allows users to perform CRUD (Create, Read, Update, Delete) operations on student data. It utilizes object-oriented principles to model students and manage their information. The system is designed for command-line interaction, making it straightforward to use.

## Features

* **Add Student:**
    * Prompts the user for student details: PRN (Permanent Registration Number), Name, Date of Birth (DOB), and Marks.
    * Creates a new `Student` object with the provided information.
    * Adds the newly created `Student` object to an internal `ArrayList` for storage.
* **Display Students:**
    * Checks if any student records exist.
    * If records are present, it iterates through the stored `Student` objects and displays their details in a formatted manner.
    * If no records are found, it displays an appropriate message.
* **Search by PRN:**
    * Prompts the user to enter the PRN of the student to search for.
    * Searches the `ArrayList` for a `Student` object with a matching PRN.
    * If found, it displays the student's details.
    * If not found, it displays a "student not found" message.
* **Search by Name:**
    * Prompts the user to enter the name of the student to search for.
    * Performs a case-insensitive search through the `ArrayList` for a matching name.
    * If found, it displays the student's details.
    * If not found, it displays a "student not found" message.
* **Search by Position:**
    * Prompts the user to enter the index of the student to search for.
    * Checks if the entered index is within the bounds of the student ArrayList.
    * If the index is valid, it displays the student's details.
    * If the index is not valid, it displays an error message.
* **Update Student:**
    * Prompts the user to enter the PRN of the student to update.
    * Searches for the `Student` object with the matching PRN.
    * If found, it prompts the user to enter new values for the student's Name, DOB, and Marks.
    * Updates the student object with the new information.
    * If not found, it displays a "student not found" message.
* **Delete Student:**
    * Prompts the user to enter the PRN of the student to delete.
    * Searches for the `Student` object with the matching PRN.
    * If found, it removes the `Student` object from the `ArrayList`.
    * If not found, it displays a "student not found" message.
* **Menu-Driven Interface:**
    * Provides a user-friendly command-line menu to navigate through the system's functionalities.
    * Uses a `Scanner` to read user input and a `switch` statement to execute the corresponding operations.

## File Structure

* **`Student.java`:**
    * Defines the `Student` class, which represents a student entity.
    * Contains attributes (PRN, Name, DOB, Marks) and corresponding getter/setter methods.
    * Contains the displayStudent() method.
* **`StudentManager.java`:**
    * Manages a collection of `Student` objects using an `ArrayList`.
    * Implements methods for adding, displaying, searching, updating, and deleting students.
* **`Main.java`:**
    * The entry point of the application.
    * Creates an instance of `StudentManager`.
    * Provides the command-line menu and handles user interactions.
* **`README.md`:**
    * This file, providing detailed information about the project.

## Data Structures

* **`ArrayList<Student>`:** Used in the `StudentManager` class to store and manage student records dynamically.

## Object-Oriented Principles

* **Encapsulation:** The `Student` class encapsulates student data and provides controlled access through getter and setter methods.
* **Abstraction:** The `StudentManager` class abstracts the underlying data storage and management.
* **Modularity:** The code is divided into well-defined classes, promoting code reusability and maintainability.