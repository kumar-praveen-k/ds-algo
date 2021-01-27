package ds.stack;

class EmptyStackException extends Exception {
    EmptyStackException() {
        super("Stack is Empty");
    }
}

class StackOverflowException extends Exception {
    StackOverflowException() {
        super("Stack is Full");
    }
}

public class ArrayStack {
    static int MAX_SIZE = 5;
    int[] a;
    int top = -1;

    ArrayStack() {
        a = new int[MAX_SIZE];
    }

    public int getSize() {
        return top + 1;
    }

    public void push(int value) throws StackOverflowException {
        if (top >= MAX_SIZE - 1) {
            throw new StackOverflowException();
        } else {
            top++;
            a[top] = value;
        }
    }

    public int pop() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        } else {
            int output = a[top];
            top--;
            return output;
        }

    }

    public int top() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        } else {
            return a[top];
        }
    }
}
