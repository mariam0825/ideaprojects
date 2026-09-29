package AcScenerio;

public class AirCondition {

    private boolean isOn = false;
    int temperature = 0;

    public boolean turnOnAc() {
        isOn = true;
        return isOn;
    }

    public boolean turnOffAc() {
        isOn = false;
        return isOn;
    }

    public int increaseTemperature() {
        int threshold = 30;
        if (temperature < threshold ){
            temperature++;
        }
        return temperature;
    }

    public int decreaseTemperature() {
        int threshold = 16;
        if (temperature > threshold ){
            temperature--;
        }
        return temperature;
    }
    public int getTemperature() {
        return temperature;
    }


}




