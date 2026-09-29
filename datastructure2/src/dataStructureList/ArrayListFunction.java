package dataStructureList;
import java.util.ArrayList;

public class ArrayListFunction {
    private int count;
    private ArrayList<String> names = new ArrayList<>();

    public boolean isEmpty() {
        return count == 0;
    }
    public void add(String name) {
        names.add(name);
        count++;
    }
    public int size() {
        return count;
    }
    public String remove(String names) {
        if (isEmpty()) {
            return null;
        }
        count--;
        String removed = names[count];
        names[count] = null;
        return removed;
    }
}

