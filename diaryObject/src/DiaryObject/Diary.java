package DiaryObject;

import java.util.ArrayList;

public class Diary {

    private String username;
    private String password;
    private ArrayList<Entry> entries;
    private boolean isLocked;
    private int userId;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.entries = new ArrayList<>();
        this.isLocked = true;
        this.userId = 1;
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unLockDairy(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        } else {
            throw new IllegalArgumentException("Wrong password");
        }
    }

    public void lockDiary() {
        isLocked = true;
    }

    private void checkIfDairyIsUnlocked() {
        if (isLocked = false) {
            throw new IllegalStateException("Diary is locked");
        }
    }

    public Entry addEntry(String title, String body) {
        checkIfDairyIsUnlocked();
        Entry entry = new Entry(userId++, title, body);
        entries.add(entry);
        return entry;
    }

    public void createEntry(String title, String body) {
        addEntry(title, body);
    }

    public Entry findEntry(int id) {
        checkIfDairyIsUnlocked();
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }
    
    public void deleteEntry(int id) {
        Entry entry = findEntry(id);
        entries.remove(entry);
    }

    public void updateEntry(int id, String title, String body) {
        Entry entry = findEntry(id);
        entry.setTitle(title);
        entry.setBody(body);
    }
}

