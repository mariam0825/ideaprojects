package datastructure2;


public class LinkedListFunction {
    private Node head;
    private int count;

    private class Node {
        String data;
        LinkedListFunction.Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public void add(String name) {
        LinkedListFunction.Node newNode = new LinkedListFunction.Node(name);
        if (head == null) {
            head = newNode;
        }
        else {
            LinkedListFunction.Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public String remove() {
        if (isEmpty()) { return null;
        }
        if (head.next == null) {
            String removed = head.data;
            head = null;
            count--;
            return removed;
        }
        LinkedListFunction.Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        String removed = current.next.data;
        current.next = null;
        count--;
        return removed;
    }
}
