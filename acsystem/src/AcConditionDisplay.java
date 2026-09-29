import AcScenerio.AirCondition;

import java.util.Scanner;

public class AcConditionDisplay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AirCondition ac = new AirCondition();
        while (true) {

    System.out.println("========== AIR CONDITIONER =============");
    System.out.println("1. Turn AC On");
    System.out.println("2. Turn AC Off");
    System.out.println("3. Increase Temperature");
    System.out.println("4. Decrease Temperature");
    System.out.println("5. Check Temperature");
    System.out.println("6. Exit");

    System.out.print("Choose an option: ");
    int choice = input.nextInt();
    switch (choice) {

case 1:
    ac.turnOnAc();
    System.out.println("AC is now ON.");
    break;

case 2:
    ac.turnOffAc();
    System.out.println("AC is now OFF.");
    break;

case 3:
    int increasedTemperature = ac.increaseTemperature();
    System.out.println("Temperature Has been increased to :" + increasedTemperature + "°C");
    break;

case 4:
    int decreasedTemperature = ac.decreaseTemperature();
    System.out.println("Temperature Has been decrease to : " + decreasedTemperature + "°C");
    break;

case 5:
    System.out.println("Temperature is now at " + ac.getTemperature() + "°C");
    break;

case 6:
    System.out.println("Thank for Using My AC GoodBye !!!!");

default:
    System.out.println("Invalid option.!!!!");
    }
        }
    }
}

