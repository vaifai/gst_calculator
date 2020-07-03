import java.util.*;

public class Cosmetics {
    private double gstRate; // unaccessible by outside classes
    private static Cosmetics obj = null;
    private static HashSet<String> container;

    private Cosmetics() {
        gstRate = 28.0;
    }

    // Singleton Class to avoid creation of multiple objects
    public static Cosmetics getInstance() {
        if (obj == null) {
            obj = new Cosmetics();
            container = new HashSet<>();
            container.add("cream");
            container.add("perfume");
            container.add("lotion");
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
    public double getCosmeticsGSTRate() {
        return obj.gstRate;
    }

    public void setCosmeticsGSTRate(double newRate) {
        obj.gstRate = newRate;

    }

}