import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding Bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display Unique Bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        System.out.println("Program continues...");
    }
}