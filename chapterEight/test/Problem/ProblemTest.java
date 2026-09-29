package Problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {

    @Test
    public void test(){
        Problem problem = new Problem("FINANICIAL");
        assertEquals("FINANICAL",problem.getName());
    }
    @Test
    public void anotherTest(){
        Problem problem = new Problem();
        assertEquals("",problem.getName());
    }

}
