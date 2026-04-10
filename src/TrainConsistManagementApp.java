import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔹 Unsorted input (will be sorted first)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        // 🔹 Search key
        String key = "BG205";

        // ✅ Step 1: Sort array (IMPORTANT)
        Arrays.sort(bogieIds);

        boolean found = binarySearch(bogieIds, key);

        // Output
        if (found) {
            System.out.println("Bogie ID " + key + " found.");
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }
    }

    // 🔥 Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // found
            } else if (result < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}