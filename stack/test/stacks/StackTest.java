package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

        private Stack myStack;
        @BeforeEach
        public void startWith(){
            myStack = new Stack();

        }
        @Test
        public void testThat_StackIsEmpty(){
            assertTrue(myStack.IsEmpty());
    }
    @Test
    public void testThat_YouPushInInsideAnEmptyStack(){
        assertTrue(myStack.IsEmpty());
        myStack.push("Mariam");
        assertFalse(myStack.IsEmpty());
    }
    @Test
    public void testThat_YouCanPushMoreThanOneThingInTheStack() {
        assertTrue(myStack.IsEmpty());
        myStack.push("Mariam");
        myStack.push("Tayo");
        myStack.push("Bella");
        assertFalse(myStack.IsEmpty());
    }
    @Test
    public void testThat_ThatYouCanPushAndPopName(){
        assertTrue(myStack.IsEmpty());
        myStack.push("Mariam");
        assertFalse(myStack.IsEmpty());
        myStack.pop();
        assertTrue(myStack.IsEmpty());
    }
    @Test
    public void testThat_YouCanPeekAtTopOfStack() {
        myStack.push("Mariam");
        myStack.push("Tayo");
        myStack.push("Bella");
        assertEquals("Bella", myStack.peek());
        assertFalse(myStack.IsEmpty());
    }
    @Test
    public void testThat_YouCanSearchForNamesAtAParticularIndex(){
        myStack.push("Mariam");
        myStack.push("Tayo");
        myStack.push("Bella");
        assertEquals("Tayo", myStack.searchAtIndex(1));
    }

}



