package DiaryObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("mariam", "1234");
    }

    @Test
    public void testThat_NewDiaryIsLocked() {
        assertTrue(diary.isLocked());
    }
    @Test
    public void testThat_CorrectPasswordUnlocksDiary() {
        diary.unLockDairy("1234");
        assertFalse(diary.isLocked());
    }
    @Test
    public void testThat_diaryCanBeLocked() {
        diary.unLockDairy("1234");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
     public void testThat_EntryCanBeAddedToDiary(){
        diary.unLockDairy("1234");
        Entry entry = diary.addEntry("Day 1", "Started my diary");
        assertNotNull(entry);
        assertEquals("Day 1", entry.getTitle());
        assertEquals("Started my diary", entry.getBody());
    }
    @Test
    public void testThat_EntriesCanDifferentId() {
        diary.unLockDairy("1234");
        Entry first = diary.addEntry("Tola", "2234");
        Entry second = diary.addEntry("Bella", "1212");
        assertNotEquals(first.getId(), second.getId());
    }
    @Test
     public void testThat_youCanCreateEntryAndStoresEntry() {
        diary.unLockDairy("1234");
        diary.createEntry("Day 1", "Today, was great");
        Entry found = diary.findEntry(1);
        assertEquals("Day 1", found.getTitle());
    }
    @Test
    public void findEntry_existingId_returnsEntry() {
        diary.unLockDairy("1234");
        Entry added = diary.addEntry("Day 1", "Today, was great");
        Entry found = diary.findEntry(added.getId());
        assertEquals("Day 1", found.getTitle());
    }

    @Test
    void findEntry_missingId_returnsNull() {
        diary.unLockDairy("1234");
        assertNull(diary.findEntry(999));
    }
    @Test
    public  void testThat_deleteEntry () {
        diary.unLockDairy("1234");
        Entry entry = diary.addEntry( "My Day", "Today was a good day" );
        int entryId = entry.getId();
        diary.deleteEntry(entryId);
        assertNull(diary.findEntry(entryId));
    }
    @Test
    public void testThat_YouCanUpdateEntry() {
        diary.unLockDairy("1234");
        Entry entry = diary.addEntry("My Day", "Today was good");
        int entryId = entry.getId();
        diary.updateEntry(entryId, "Day 1", "Today was great");
        Entry found = diary.findEntry(entryId);
        assertEquals("Day 1", found.getTitle());
        assertEquals("Today was great", found.getBody());
    }
}
