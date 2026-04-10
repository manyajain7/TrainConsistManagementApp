import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Test Case 1: Basic Alphabetical Sorting
        String[] tc1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        sortAndPrint("Test 1 - Basic", tc1);

        // 🔹 Test Case 2: Unsorted Input
        String[] tc2 = {"Luxury","General","Sleeper","AC Chair"};
        sortAndPrint("Test 2 - Unsorted", tc2);

        // 🔹 Test Case 3: Already Sorted
        String[] tc3 = {"AC Chair","First Class","General"};
        sortAndPrint("Test 3 - Already Sorted", tc3);

        // 🔹 Test Case 4: Duplicate Names
        String[] tc4 = {"Sleeper","AC Chair","Sleeper","General"};
        sortAndPrint("Test 4 - Duplicates", tc4);

        // 🔹 Test Case 5: Single Element
        String[] tc5 = {"Sleeper"};
        sortAndPrint("Test 5 - Single Element", tc5);
    }

    // 🔥 Reusable method
    public static void sortAndPrint(String label, String[] arr) {
        System.out.println("\n" + label + " (Before): " + Arrays.toString(arr));

        Arrays.sort(arr); // ✅ core logic

        System.out.println(label + " (After):  " + Arrays.toString(arr));
    }
}