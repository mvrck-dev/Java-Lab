// Name: Rupankar Das
// PRN: 23070126111
// Batch: Class of 2027 | B.Tech AIML | B2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator Program!");

        boolean exit = false;
        while (!exit) {
            // Display menu options to the user
            System.out.println("Choose an option:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci\n6. Mean\n7. Mode\n8. Exit");
            int choice = userInput.getNumberInput();

            switch (choice) {
                case 1:
                    // Addition operation
                    System.out.println("Enter two numbers:");
                    double a = userInput.getDoubleInput();
                    double b = userInput.getDoubleInput();
                    System.out.println("Result: " + calculator.add(a, b));
                    break;
                case 2:
                    // Subtraction operation
                    System.out.println("Enter two numbers:");
                    a = userInput.getDoubleInput();
                    b = userInput.getDoubleInput();
                    System.out.println("Result: " + calculator.subtract(a, b));
                    break;
                case 3:
                    // Multiplication operation
                    System.out.println("Enter two numbers:");
                    a = userInput.getDoubleInput();
                    b = userInput.getDoubleInput();
                    System.out.println("Result: " + calculator.multiply(a, b));
                    break;
                case 4:
                    // Division operation
                    System.out.println("Enter two numbers:");
                    a = userInput.getDoubleInput();
                    b = userInput.getDoubleInput();
                    System.out.println("Result: " + calculator.divide(a, b));
                    break;
                case 5:
                    // Fibonacci sequence calculation
                    System.out.println("Enter a number for Fibonacci sequence:");
                    int n = userInput.getNumberInput();
                    System.out.println("Fibonacci result: " + calculator.fibonacci(n));
                    break;
                case 6:
                    // Mean calculation
                    System.out.println("Enter array size:");
                    int size = userInput.getNumberInput();
                    double[] arr = userInput.getArrayInput(size);
                    System.out.println("Mean: " + calculator.mean(arr));
                    break;
                case 7:
                    // Mode calculation
                    System.out.println("Enter array size:");
                    size = userInput.getNumberInput();
                    int[] intArr = userInput.getIntArrayInput(size);
                    System.out.println("Mode: " + calculator.mode(intArr));
                    break;
                case 8:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    // Handle invalid options
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
