import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " to " + shape + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
            throw e; // 🔥 important
        } finally {
            System.out.println("Assignment attempt completed for " + shape + " bogie\n");
        }
    }

    public String toString() {
        return shape + " | Cargo: " + (cargo == null ? "None" : cargo);
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);

        // ✅ Safe assignment
        try {
            b1.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {}

        // ❌ Unsafe assignment
        try {
            b2.assignCargo("Petroleum");
        } catch (CargoSafetyException e) {}

        // ✅ Program continues
        try {
            b2.assignCargo("Coal");
        } catch (CargoSafetyException e) {}

        System.out.println("\nFinal Bogie Status:");
        bogies.forEach(System.out::println);
    }
}