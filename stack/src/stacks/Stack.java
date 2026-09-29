package stacks;

public class Stack {

    private int counter;
    private String[] stackContainer = new String[4];

    public boolean IsEmpty() {
        return counter == 0;
    }

    public void push(String name) {
        stackContainer[counter] = name;
        counter++;
    }

    public String pop() {
        if (IsEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        counter--;
        String name = stackContainer[counter];
        stackContainer[counter] = null;
        return name;
    }

    public String peek() {
        if (IsEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return stackContainer[counter - 1];
    }

    public String searchAtIndex(int index) {
        if (index < 0 || index >= counter) {
            throw new IllegalArgumentException("Invalid index");
        }

        return stackContainer[index];
    }


}

