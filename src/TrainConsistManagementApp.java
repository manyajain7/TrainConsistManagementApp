import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Adding duplicate bogie (should be ignored)
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        System.out.println("Program continues...");
    }
}