package MyBike;

public class MyBikeMain {
    public static void main(String[] args) {

        AutomaticBike myBike = new AutomaticBike();

        System.out.println("Initial speed: " + myBike.setSpeed());

        myBike.turnOnBike();
        System.out.println("Bike on: " + myBike.control());

        myBike.accelerate();
        System.out.println("Speed after acceleration: " + myBike.setSpeed());

        myBike.accelerate();
        System.out.println("Speed after acceleration: " + myBike.setSpeed());

        myBike.decelerate();
        System.out.println("Speed after deceleration: " + myBike.setSpeed());

        myBike.turnOffBike();
        System.out.println("Bike on: " + myBike.control());
    }

}
