// Name: Rupankar Das
// PRN: 23070126111
// Batch: AIML 2023-27
// Github : https://github.com/mvrck-dev/Java-Lab/tree/main/Assignments/Assignment%204

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2:
                    System.out.print("Enter length and width of the rectangle: ");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.print("Enter side of the square: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;

                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    volumeShape = new Sphere(sphereRadius);
                    break;

                case 5:
                    System.out.print("Enter radius and height of the cylinder: ");
                    double cylRadius = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    volumeShape = new Cylinder(cylRadius, height);
                    break;

                case 6:
                    System.out.print("Enter base side and height of the equilateral pyramid: ");
                    double baseSide = scanner.nextDouble();
                    double pyrHeight = scanner.nextDouble();
                    volumeShape = new EquilateralPyramid(baseSide, pyrHeight);
                    break;

                case 7:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            if (shape != null) {
                shape.displayShape();
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }

            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
        scanner.close();
    }
}
