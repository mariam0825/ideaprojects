package DiaryObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    private Diaries diaries;

    @BeforeEach
    void setUp() {
        diaries = new Diaries();
    }

    @Test
    public void testThat_YouCanAddDiary() {
        diaries.add("Mariam", "1234");
        Diary found = diaries.findByUsername("Mariam");
        assertEquals("Mariam", found.getUsername());
    }
    @Test
    public void testThatYouCanDeleteDiary() {
        diaries.add("Mariam", "1234");
        diaries.delete("Mariam", "1234");
        assertNull(diaries.findByUsername("Mariam"));
    }
}