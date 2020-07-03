import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Number of units,Commodity and Unit Price");
        System.out.println("separated by space. Press only 0 to exit");
        String s[] = br.readLine().split(" ");
        while (true) {
            if (s.length == 1) {
                try {
                    int x = Integer.parseInt(s[0]);
                    if (x == 0)
                        break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid integer for Number of Units");
                    System.out.println("and a valid real number for the unit price");
                    System.out.println("or 0 to end");
                }

            }
            if (s.length != 3) {
                System.out.println("Please enter in the same order as specified above");
                // continue;
            } else {
                try {
                    int numOfUnits = Integer.parseInt(s[0]);
                    String commodity = s[1].trim().toLowerCase();
                    double unitPrice = Double.parseDouble(s[2]);
                    if (foodGrains.getInstance().hasCommodity(commodity)) {
                    }
                    double gstRate = foodGrains.getInstance().getFoodGSTRate();
                    System.out.println(unitPrice * gstRate);

                } catch (Exception e) {
                    System.out.println("Please enter a valid integer for Number of Units");
                    System.out.println("and a valid real number for the unit price");
                    System.out.println("or 0 to end");
                    System.out.println(e);
                }
            }
            s = br.readLine().split(" ");

        }
    }

}