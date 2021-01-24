package ds.queue;

public class ArrayQueue {
    int[] arr;
    int front;
    int rear;
    static int MAX_SIZE = 100;
    private int _size = 0;

    ArrayQueue() {
        this.front = -1;
        this.rear = -1;
        arr = new int[MAX_SIZE];
    }

    public int getSize() {
        return _size;
    }

    public int enqueue(int val) throws Exception {
        _size++;
        if (rear == MAX_SIZE - 1 && front == 0 || rear == front - 1) {
            throw new FullQueueException();
        }

        rear = (rear + 1) % MAX_SIZE;
        arr[rear] = val;
        if (front == -1) front = 0;
        return val;
    }

    public int dequeue() throws EmptyQueueException {
        if (front == -1) {
            throw new EmptyQueueException();
        }
        int deleted = arr[rear];
        if (front == rear) {
            _size--;
            front = rear = -1;
        } else {
            _size--;
            front = (front + 1) % MAX_SIZE;
        }
        return deleted;
    }

    public int peek() throws EmptyQueueException {
        if (front == -1) {
            throw new EmptyQueueException();
        } else {
            return arr[front];
        }
    }
}
