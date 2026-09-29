package GeoPoliticalZone;

import java.util.Scanner;

public class GeoPoliticalMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Which state are you looking for :");
        String state = input.next();

        GeoPolitical zone = GeoPoliticalMethod.findZone(state);
        if (zone == null) {
            System.out.print("State doesn't exist in Nigeria");
        } else {
            System.out.println("The state " + state + " is in " + zone + " Geo-political Zone");
        }
    }
}