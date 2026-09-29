package stacks;

public class Queue {

    private String[] queueContainer = new String[4];
    private int counter;

    public boolean isEmpty() {
        return counter == 0;
    }

    public void enqueue(String names) {
        queueContainer[counter] = names;
        counter++;
    }
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        String name = queueContainer[0];
        for (int index = 0; index < counter - 1; index++) {
            queueContainer[index] = queueContainer[index + 1];
        }
        counter--;
        queueContainer[counter] = null;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return queueContainer[0];
    }
    public int find(String name) {
        for (int index = 0; index < counter; index++) {
            if (queueContainer[index].equals(name)) {
                return index;}
        }
        return -1;
    }
    public String get(int index) {
        if (index < 0 || index >= counter) {
            throw new IllegalArgumentException("Invalid index");
        }
        return queueContainer[index];
    }

}

