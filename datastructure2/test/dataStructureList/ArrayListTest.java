package dataStructureList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private ArrayList arrayList;
    @BeforeEach
    public void startWith(){
        arrayList =new ArrayList();
    }
@Test
    public void testThat_ArrayListIsEmpty(){
       assertTrue(arrayList.isEmpty());
}
@Test
    public void testThat_YouCanAddToAnArrayList(){
    assertTrue(arrayList.isEmpty());
    arrayList.add("Mariam");
    assertFalse(arrayList.isEmpty());
    }
    @Test
    public void testThat_YouCanAddMoreToAList(){
        assertTrue(arrayList.isEmpty());
        arrayList.add("Mariam");
        arrayList.add("Sarah");
         arrayList.add("Bella");
        assertFalse(arrayList.isEmpty());
    }
    @Test
    public void testThat_YouCanRemoveFromTheList(){
        assertTrue(arrayList.isEmpty());
        arrayList.add("Mariam");
        arrayList.add("Sarah");
        arrayList.add("Bella");
        assertFalse(arrayList.isEmpty());
        assertEquals("Bella",arrayList.remove());
    }
    @Test
    public void testThat_RemoveReturnsLastItem() {
        arrayList.add("Mariam");
        arrayList.add("Sarah");
        assertEquals("Sarah", arrayList.remove());
        assertEquals("Mariam", arrayList.remove());
    }
    @Test
    public void testThat_ListIsEmptyAfterRemovingEverything() {
        arrayList.add("Mariam");
        arrayList.add("Sarah");
        arrayList.remove();
        arrayList.remove();
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testThat_SizeIncreasesWhenAdding() {
        assertEquals(0, arrayList.size());
        arrayList.add("Mariam");
        assertEquals(1, arrayList.size());
        arrayList.add("Sarah");
        assertEquals(2, arrayList.size());
    }
    @Test
    public void testThat_SizeDecreasesWhenRemoving() {
        arrayList.add("Mariam");
        arrayList.add("Sarah");
        assertEquals(2, arrayList.size());
        arrayList.remove();
        assertEquals(1, arrayList.size());
    }
    @Test
    public void testThat_RemoveFromEmptyListReturnsNull() {
        assertNull(arrayList.remove());
    }
}

