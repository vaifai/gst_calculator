import java.util.*;

public class Electronics {
    private double gstRate; // unaccessible by outside classes
    private static Electronics obj = null;
    private static HashSet<String> container;

    private Electronics() {
        gstRate = 18.0;
    }

    // Singleton Class to avoid creation of multiple objects
    public static Electronics getInstance() {
        if (obj == null) {
            obj = new Electronics();
            container = new HashSet<>();
            container.add("mobile");
            container.add("tv");
            container.add("tablet");
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
    public double getElectronicsGSTRate() {
        return obj.gstRate;
    }

    public void setElectronicsGSTRate(double newRate) {
        obj.gstRate = newRate;

    }

}