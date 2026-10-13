package dataStructureList;
import java.util.ArrayList;

public class ArrayListFunction {
    private int count;
    private ArrayList<String> names = new ArrayList<>();

    public boolean isEmpty() {
        return count == 0;
    }
    public void add(String name) {
        names.add(name); count++;
    }
    public int size() {
        return count;
    }
    public String remove() {
        if (isEmpty()) {
            return null;
        }
        count--;
        String removed = names.get(count);
        names.remove(count);
        return removed;
    }
}

