package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue theQueue;

    @BeforeEach
    public void startWith() {
        theQueue = new Queue();
    }

    @Test
    public void testThat_QueueIsEmpty() {
        assertTrue(theQueue.isEmpty());
    }

    @Test
    public void testThat_YouCanEnqueueInsideAnEmptyQueue() {
        assertTrue(theQueue.isEmpty());
        theQueue.enqueue("Mariam");
        assertFalse(theQueue.isEmpty());
    }

    @Test
    public void testThat_YouCanEnQueueMoreThanOneThingInsideAQueue() {
        assertTrue(theQueue.isEmpty());
        theQueue.enqueue("Mariam");
        theQueue.enqueue("Tayo");
        theQueue.enqueue("Bella");
        assertFalse(theQueue.isEmpty());
    }
    @Test
    public void testThat_YouCanDeQueueInsideAQueue() {
        assertTrue(theQueue.isEmpty());
        theQueue.enqueue("Mariam");
        assertFalse(theQueue.isEmpty());
        theQueue.dequeue();
        assertTrue(theQueue.isEmpty());
    }
    @Test
    public void testThat_YouCanPeekInsideAQueue(){
        theQueue.enqueue("Mariam");
        theQueue.enqueue("Tayo");
        theQueue.enqueue("Bella");
        assertEquals("Mariam", theQueue.peek());
        assertFalse(theQueue.isEmpty());
    }
    @Test
    public void testThat_YouCanFindANameAtAParticularIndex() {
        theQueue.enqueue("Mariam");
        theQueue.enqueue("Tayo");
        theQueue.enqueue("Bella");
        assertEquals("Mariam", theQueue.get(0));
        assertEquals("Tayo", theQueue.get(1));
        assertEquals("Bella", theQueue.get(2));
    }


}

