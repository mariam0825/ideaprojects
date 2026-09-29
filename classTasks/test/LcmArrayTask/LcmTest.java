package LcmArrayTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LcmTest {
    @Test
    public void  testThat_forValuesThatCanDivideTheArray8(){
        int[] numbers = {8,10,24};
        int[] expected = {1,10,24};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(expected,actualResult);

    }
    @Test
    public void testThat_forValuesThatCanDivideTheArray10(){
        int[] numbers = {8,10,24};
        int[] expected = {8,1,24};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(expected,actualResult);

    }
    @Test
    public void testThat_forValuesThatCanDivideTheArray24(){
        int[] numbers = {8,10,24};
        int[] expected = {8,10,1};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(expected,actualResult);
    }
    @Test
    public void testThat_forValuesThatDivideTheArrayWith2 (){
        int[] numbers = {8,10,24};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(2 ,actualResult);

    }
    @Test
    public void testThat_forValuesThatDivideTheArrayWith3 (){
        int[] numbers = {8,10,24};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(3 ,actualResult);

    }
    @Test
    public void testThat_forValuesThatdivideTheArrayWith5 (){
        int[] numbers = {8,10,24};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(5 ,actualResult);

    }
    @Test
    public void testThat_MultiplyValuesThatDivideTheArrayTogather (){
        int[] numbers = {8,10,24};
        int[] actualResult = Lcmfunction.solution(numbers);
        assertEquals(120 ,actualResult);

    }
}
