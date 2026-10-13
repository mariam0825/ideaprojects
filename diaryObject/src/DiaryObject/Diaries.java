package DiaryObject;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private List<Diary> diaries;

    public Diaries() {
        diaries = new ArrayList<>();
    }

    public void add(String username, String password) {
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    public void delete(String username, String password) {
        Diary diary = findByUsername(username);
        if (diary != null) {
            diaries.remove(diary);
        }
    }
}