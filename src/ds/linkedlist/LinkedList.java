package ds.linkedlist;

import java.util.StringJoiner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    private Node head = null;
    private int _size = 0;

    public int getSize() {
        return _size;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void add(int data, int position) {
        _size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (position <= 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;
        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public int delete(int position) {
        if (_size == 0) return 0;
        if (_size == 1) {
            int value = head.data;
            head = null;
            _size = 0;
            return value;
        }

        _size--;
        if (position <= 1) {
            int value = head.data;
            head = head.next;
            return value;
        }

        int count = 1;
        Node current = head;
        while (current.next.next != null && count < position - 1) {
            current = current.next;
            count++;
        }
        int value = current.next.data;
        if (current.next.next != null) current.next = current.next.next;
        else current.next = null;

        return value;
    }

    public void reverselist() {
        if (_size <= 1) return;
        Node current = head;
        Node reverse = null;
        while (current != null) {
            head = current.next;
            current.next = reverse;
            reverse = current;
            current = head;
        }
        head = reverse;
    }

    public void push(int value) {
        add(value, _size + 1);
    }

    public void prepend(int value) {
        add(value, 1);
    }

    public int elementAt(int position) {
        if (position <= 0 || position > getSize()) {
            throw new IndexOutOfBoundsException("Index " + position + " is out of range from 1 to " + _size);
        }

        if (_size < 1) return -1;
        Node current = head;
        while (current.next != null && position > 1) {
            current = current.next;
            position--;
        }
        return current.data;
    }

    public String toString() {
        if (head == null) return "";

        StringJoiner j = new StringJoiner(" -> ");
        Node curr = head;
        while (curr != null) {
            j.add(Integer.toString(curr.data));
            curr = curr.next;
        }

        return j.toString();
    }

    static LinkedList fromArray(int[] array) {
        LinkedList l = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            l.add(array[i], i + 1);
        }

        return l;
    }
}