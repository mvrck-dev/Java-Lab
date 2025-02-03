import java.util.ArrayList;
import java.util.Scanner;

// This class handles the separation of even and odd numbers from user input.
public class EvenOddSeparator {
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> odd = new ArrayList<>();

    // Accepts numbers from the user and categorizes them
    public void acceptNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        scanner.close();
    }

    // Displays the even and odd numbers separately
    public void display() {
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
