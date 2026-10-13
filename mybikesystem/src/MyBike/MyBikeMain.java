package MyBike;

import java.util.Scanner;

public class MyBikeMain {
    public static void main(String[] args) {

        AutomaticBike myBike = new AutomaticBike();

        while (true) {

            System.out.println("1. Turn Bike On");
            System.out.println("2. Turn Bike Off");
            System.out.println("3. Accelerate");
            System.out.println("4. Decelerate");
            System.out.println("5. Get Speed");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ready For The Bike : ");
            int choice = scanner.nextInt();


            if (choice == 1) {
                myBike.turnOnBike();
                System.out.println("Bike is ON");

            } else if (choice == 2) {
                myBike.turnOffBike();
                System.out.println("Bike is OFF");
            } else if (choice == 3) {
                myBike.accelerate();
                System.out.println("Speed: " + myBike.setSpeed());
            } else if (choice == 4) {
                myBike.decelerate();
                System.out.println("Speed: " + myBike.setSpeed());
            } else if (choice == 5) {
                System.out.println("Current speed: " + myBike.setSpeed());
            } else if (choice == 6) {
                System.out.println("Bike turnOff !!!");
                break;

            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
