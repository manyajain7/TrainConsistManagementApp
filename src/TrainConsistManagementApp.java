import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString() {
        return type + " | Cargo: " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);

        // UC12: Safety Validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        System.out.println("\nSafety Compliance Status: " +
                (isSafe ? "SAFE" : "UNSAFE"));
    }
}