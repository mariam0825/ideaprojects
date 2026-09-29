package MyBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBikeTest {

    private AutomaticBike myBike;

    @BeforeEach
    public void setUp() {
        myBike = new AutomaticBike();
    }

    @Test
    public void testThat_TheBikeCanBeOn() {
        myBike.turnOnBike();

        assertTrue(myBike.control());
    }

    @Test
    public void testThat_TheBikeCanBeOff() {
        myBike.turnOnBike();
        myBike.turnOffBike();

        assertFalse(myBike.control());
    }

    @Test
    public void testThat_BikeCanAccelerateOnGearOne() {
        myBike.turnOnBike();
        int actual = myBike.accelerate();
        assertEquals(1, actual);
    }

    @Test
    public void testThat_BikeCanAccelerateOnGearTwo() {
        myBike.turnOnBike();
        myBike.speed = 20;
        int actual = myBike.accelerate();
        assertEquals(21, actual);
    }

    @Test
    public void testThat_BikeCanAccelerateOnGearThree() {
        myBike.turnOnBike();
        myBike.speed = 30;
        int actual = myBike.accelerate();
        assertEquals(32, actual);
    }

    @Test
    public void testThat_BikeCanAccelerateOnGearFour() {
        myBike.turnOnBike();
        myBike.speed = 40;
        int actual = myBike.accelerate();
        assertEquals(43, actual);
    }

    @Test
    public void testThat_BikeCanDecelerateOnGearOne() {
        myBike.turnOnBike();
        myBike.speed = 15;
        int actual = myBike.decelerate();
        assertEquals(14, actual);
    }

    @Test
    public void testThat_BikeCanDecelerateOnGearTwo() {
        myBike.turnOnBike();
        myBike.speed = 25;
        int actual = myBike.decelerate();
        assertEquals(23, actual);
    }

    @Test
    public void testThat_BikeCanDecelerateOnGearThree() {
        myBike.turnOnBike();
        myBike.speed = 35;
        int actual = myBike.decelerate();
        assertEquals(32, actual);
    }

    @Test
    public void testThat_BikeCanDecelerateOnGearFour() {
        myBike.turnOnBike();
        myBike.speed = 45;
        int actual = myBike.decelerate();
        assertEquals(41, actual);
    }
    @Test
    public void testThat_ForSpeed(){
        assertEquals(0, myBike.setSpeed());
    }
}
