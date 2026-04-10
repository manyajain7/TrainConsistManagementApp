import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Case 1: EMPTY array (will throw exception)
        String[] bogieIds = {};

        String key = "BG101";

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID " + key + " found.");
            } else {
                System.out.println("Bogie ID " + key + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 🔹 Case 2: VALID data (normal execution)
        String[] bogieIds2 = {"BG309","BG101","BG205"};

        Arrays.sort(bogieIds2);

        try {
            boolean found2 = searchBogie(bogieIds2, "BG205");

            if (found2) {
                System.out.println("Bogie ID BG205 found.");
            } else {
                System.out.println("Bogie ID BG205 not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔥 UC20 METHOD (Validation + Binary Search)
    public static boolean searchBogie(String[] arr, String key) {

        // ❗ FAIL-FAST VALIDATION
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // 🔹 Binary Search (UC19 logic reused)
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}