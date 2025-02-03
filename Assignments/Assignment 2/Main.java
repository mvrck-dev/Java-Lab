// Name: Rupankar Das
// PRN: 23070126111
// Batch: Class of 2027 | AIML B2
// Description: This program demonstrates array operations, including separation of even/odd numbers, 
// finding the smallest distance between two numbers, and converting between arrays and ArrayLists.

public class Main {
    public static void main(String[] args) {
        // Example usage of different functionalities
        
        // Separate even and odd numbers
        EvenOddSeparator separator = new EvenOddSeparator();
        separator.acceptNumbers();
        separator.display();

        // Find smallest distance between two adjacent numbers
        int[] arr = {3, 8, 15, 2, 7, 9};
        int index = SmallestDistanceFinder.findSmallestDistanceIndex(arr);
        System.out.println("Index of the first number with the smallest distance: " + index);

        // Convert between Array and ArrayList
        ArrayConverter converter = new ArrayConverter();
        converter.arrayToArrayList();
        converter.arrayListToArray();
    }
}
