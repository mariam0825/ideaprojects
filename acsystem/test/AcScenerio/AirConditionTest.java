package AcScenerio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AirConditionTest {

    @Test
    public void testThat_TheAcCanBeTurnOn() {
        AirCondition ac = new AirCondition();
        boolean expected = ac.turnOnAc();
        assertTrue(expected);
    }

    @Test
    public void testThat_TheAcCanBeTurnOff() {
        AirCondition ac = new AirCondition();
        boolean expected = ac.turnOffAc();
        assertTrue(expected);

    }

    @Test
    public void testThat_AcCanBeIncreased() {
        AirCondition ac = new AirCondition();
        int expectedResult = ac.increaseTemperature();
        assertEquals(25, expectedResult);
    }

    @Test
    public void testThat_AcCanBeDecreased() {
        AirCondition ac = new AirCondition();
        int expectedResult = ac.decreaseTemperature();
        assertEquals(12, expectedResult);

    }

    @Test
    public void testThat_AcTemperatureCannotGoAbove30() {
        AirCondition ac = new AirCondition();
        int expectedResult = 30;
        ac.increaseTemperature();
        assertEquals(expectedResult,ac.increaseTemperature());
    }

    @Test
    public void testThat_AcTemperatureCannotGoBelow16() {
        AirCondition ac = new AirCondition();
        ac.decreaseTemperature();
        assertEquals(16, ac.decreaseTemperature());
    }
}