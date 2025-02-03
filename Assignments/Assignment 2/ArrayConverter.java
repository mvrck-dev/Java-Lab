import java.util.ArrayList;
import java.util.Arrays;

// This class provides methods to convert between arrays and ArrayLists.
public class ArrayConverter {
    // Converts an array to an ArrayList
    public void arrayToArrayList() {
        String[] arr = {"Apple", "Banana", "Cherry"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Converted Array to ArrayList: " + list);
    }

    // Converts an ArrayList to an array
    public void arrayListToArray() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        String[] arr = list.toArray(new String[0]);

        System.out.println("Converted ArrayList to Array: " + Arrays.toString(arr));
    }
}
