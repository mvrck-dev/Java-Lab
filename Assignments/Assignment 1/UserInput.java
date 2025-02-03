// Name: Rupankar Das
// PRN: 23070126111
// Batch: Class of 2027 | B.Tech AIML | B2

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner; // Initialize scanner
    }

    public int getNumberInput() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt(); // Read and return an integer
    }

    public double getDoubleInput() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble(); // Read and return a double
    }

    public double[] getArrayInput(int size) {
        double[] array = new double[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble(); // Read and store each double
        }
        return array; // Return the array of doubles
    }

    public int[] getIntArrayInput(int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Read and store each integer
        }
        return array; // Return the array of integers
    }
}
