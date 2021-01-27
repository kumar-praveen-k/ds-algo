package ds.stack;

import ds.linkedlist.LinkedList;

public class LinkedListStack {
    private LinkedList list;
    LinkedListStack() {
        list = new LinkedList();
    }

    public int getSize(){
        return list.getSize();
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public void push(int value) { list.prepend(value); }
    public int pop() throws EmptyStackException {
        if(getSize() == 0) {
            throw new EmptyStackException();
        }
        int output = top();
        list.delete(1);
        return output;
    }
    public int top() throws EmptyStackException {
        if(getSize() == 0) {
            throw new EmptyStackException();
        }
        return list.elementAt(1);
    }
}
