package MyBike;

public class AutomaticBike {
    private boolean control = false;
    int speed = 0;


    public boolean turnOnBike() {
        control= true;
        return control;
    }

    public boolean turnOffBike() {
        control = false;
        return control;
    }
    public boolean control() {

        return control;
    }

    public int accelerate() {

        if (control) {
            if (speed <= 20) {
                speed++;
            } else if (speed <= 30) {
                speed += 2;
            } else if (speed <= 40) {
                speed += 3;
            } else {
                speed += 4;
            }
        }

        return speed;

    }

    public int decelerate() {
        if (control) {
            if (speed <= 20) {
                speed--;
            } else if (speed <= 30) {
                speed -= 2;
            } else if (speed <= 40) {
                speed -= 3;
            } else {
                speed -= 4;
            }

            if (speed < 0) {
                speed = 0;
            }
        }

        return speed;
    }

    public int setSpeed() {
        return speed;
    }

    }



