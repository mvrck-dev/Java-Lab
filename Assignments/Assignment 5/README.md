# ShapeProject

## Overview
ShapeProject is a **menu-driven Java program** that calculates the **area, perimeter, and volume** of different shapes using **OOP principles** like **abstract classes** and **interfaces**. 

## Features
- **Supports 2D Shapes:** Circle, Rectangle, Square.
- **Supports 3D Shapes:** Sphere, Cylinder, Equilateral Pyramid.
- **Uses an abstract class (`Shape`)** for common shape properties.
- **Implements an interface (`Volume`)** for 3D shape volume calculations.
- **Menu-driven system** that allows users to input shape dimensions and get results.

## Class Structure

### **1. Abstract Class: `Shape`**
- Defines a **common structure** for all shapes.
- Contains a **constructor** to initialize the shape name.
- Includes **two abstract methods:**
  - `calculateArea()`
  - `calculatePerimeter()`

### **2. Interface: `Volume`**
- Defines the method **`calculateVolume()`** for 3D shapes.

### **3. Shape Implementations**
| Class Name            | Type  | Implements `calculateArea()` | Implements `calculatePerimeter()` | Implements `calculateVolume()` |
|----------------------|-------|-----------------------------|---------------------------------|-------------------------------|
| `Circle`             | 2D    | ✅                           | ✅                               | ❌                             |
| `Rectangle`          | 2D    | ✅                           | ✅                               | ❌                             |
| `Square`            | 2D    | ✅                           | ✅                               | ❌                             |
| `Sphere`            | 3D    | ✅                           | ❌                               | ✅                             |
| `Cylinder`          | 3D    | ✅                           | ❌                               | ✅                             |
| `EquilateralPyramid` | 3D    | ✅                           | ✅                               | ✅                             |
