import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return type + " | Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // Creating dataset (large for better benchmarking)
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", 50 + (i % 50))); // capacities vary
        }

        // 🔹 Loop-based filtering
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 Stream-based filtering
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ✅ Results
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        System.out.println("\nResults Match: " +
                (loopResult.size() == streamResult.size()));
    }
}