import java.util.*;

public class Furniture {
    private double gstRate; // unaccessible by outside classes
    private static Furniture obj = null;
    private static HashSet<String> container; // contains all types of electronics

    private Furniture() {
        gstRate = 5.0;
    }

    // Singleton Class to avoid creation of multiple objects
    public static Furniture getInstance() {
        if (obj == null) {
            obj = new Furniture();
            container = new HashSet<>();
            container.add("table");
            container.add("sofa");
            container.add("chair");
        }
        return obj;
    }

    public boolean hasCommodity(String commodity) {
        return container.contains(commodity);
    }

    public void addCommodity(String commodity) {
        container.add(commodity);
    }

    public void removeCommodity(String commodity) {
        container.remove(commodity);
    }

    // Getters and Setters for GSTRates
    public double getFurnitureGSTRate() {
        return obj.gstRate;
    }

    public void setFurnitureGSTRate(double newRate) {
        obj.gstRate = newRate;

    }

}