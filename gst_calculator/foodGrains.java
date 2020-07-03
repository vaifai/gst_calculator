import java.util.*;

public class foodGrains {
    private double gstRate; // unaccessible by outside classes
    private static foodGrains obj = null;
    private static HashSet<String> container; // all types of food grains

    private foodGrains() {
        gstRate = 0.0;
    }

    // Singleton Class to avoid creation of multiple objects
    public static foodGrains getInstance() {
        if (obj == null) {
            System.out.println("Food grain");
            obj = new foodGrains();
            container = new HashSet<>();
            container.add("rice");
            container.add("wheat");
            container.add("dal");
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
    public double getFoodGSTRate() {
        return obj.gstRate;
    }

    public void setFoodGSTRate(double newRate) {
        obj.gstRate = newRate;

    }

}