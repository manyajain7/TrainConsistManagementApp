import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Test Case Array
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        // 🔹 Test Cases
        testSearch("Test 1 - Found", bogieIds, "BG309");
        testSearch("Test 2 - Not Found", bogieIds, "BG999");
        testSearch("Test 3 - First Element", bogieIds, "BG101");
        testSearch("Test 4 - Last Element", bogieIds, "BG550");

        // 🔹 Single Element Case
        String[] single = {"BG101"};
        testSearch("Test 5 - Single Element", single, "BG101");
    }

    // 🔥 Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (String id : arr) {
            if (id.equals(key)) {  // ✅ safe comparison
                return true;       // early stop
            }
        }
        return false;
    }

    // 🔹 Helper Method to Print Results
    public static void testSearch(String label, String[] arr, String key) {
        System.out.println("\n" + label);
        System.out.println("Searching: " + key);
        System.out.println("Result: " + linearSearch(arr, key));
    }
}