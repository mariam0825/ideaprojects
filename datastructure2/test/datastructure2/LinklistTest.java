package datastructure2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinklistTest {

    private LinkedListFunction linkedList;
    @BeforeEach
    public void startWith() {
        linkedList = new LinkedListFunction();
    }

    @Test
    public void testThat_LinkedListIsEmpty() {
        assertTrue(linkedList.isEmpty());
    }
    @Test
    public void testThat_YouCanAddToLinkedList() {
        assertTrue(linkedList.isEmpty());
        linkedList.add("Mariam");
        assertFalse(linkedList.isEmpty());
    }
    @Test
    public void testThat_YouCanAddMoreToLinkedList() {
        linkedList.add("Mariam");
        linkedList.add("Sarah");
        linkedList.add("Bella");
        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());
    }
    @Test
    public void testThat_YouCanRemoveFromLinkedList() {
        linkedList.add("Mariam");
        linkedList.add("Sarah");
        linkedList.add("Bella");
        assertEquals("Bella", linkedList.remove());
    }
    @Test
    public void testThat_RemoveReturnsLastItem() {
        linkedList.add("Mariam");
        linkedList.add("Sarah");
        assertEquals("Sarah", linkedList.remove());
        assertEquals("Mariam", linkedList.remove());
    }

    @Test
    public void testThat_LinkedListIsEmptyAfterRemovingEverything() {
        linkedList.add("Mariam");
        linkedList.add("Sarah");
        linkedList.remove();
        linkedList.remove();
        assertTrue(linkedList.isEmpty());
    }
    @Test
    public void testThat_SizeStartsAtZero() {
        assertEquals(0, linkedList.size());
    }
    @Test
    public void testThat_SizeIncreasesWhenAdding() {
        assertEquals(0, linkedList.size());
        linkedList.add("Mariam");
        assertEquals(1, linkedList.size());
        linkedList.add("Sarah");
        assertEquals(2, linkedList.size());
        linkedList.add("Bella");
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testThat_SizeDecreasesWhenRemoving() {
        linkedList.add("Mariam");
        linkedList.add("Sarah");
        assertEquals(2, linkedList.size());
        linkedList.remove();
        assertEquals(1, linkedList.size());
    }
    @Test
    public void testThat_RemoveFromEmptyLinkedListReturnsNull() {
        assertNull(linkedList.remove());
    }
    @Test
    public void testThat_LinkedListCanBeUsedAgainAfterRemovingEverything() {
        linkedList.add("Mariam");
        linkedList.remove();
        assertTrue(linkedList.isEmpty());
        linkedList.add("Sarah");
        assertFalse(linkedList.isEmpty());
        assertEquals("Sarah", linkedList.remove());
    }
}






