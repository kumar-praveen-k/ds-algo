package ds.queue;

import ds.linkedlist.LinkedList;

class EmptyQueueException extends Exception {
    EmptyQueueException() {
        super("Queue is empty");
    }
}

class FullQueueException extends Exception {
    FullQueueException() {
        super("Queue is full");
    }
}

public class LinkedListQueue {
    private LinkedList list;

    LinkedListQueue() {
        list = new LinkedList();
    }

    public int getSize() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void enqueue(int value) {
        list.push(value);
    }

    public int dequeue() {
        return list.delete(1);
    }

    public int peek() throws EmptyQueueException {
        if (getSize() == 0) throw new EmptyQueueException();
        return list.elementAt(1);
    }
}
