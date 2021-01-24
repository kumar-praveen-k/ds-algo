package ds.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void LinkedlistImplementationQueue() throws EmptyQueueException {
        LinkedListQueue qu = new LinkedListQueue();
        assertEquals(0, qu.getSize());

        qu.enqueue(5);
        assertEquals(1, qu.getSize());
        assertEquals(5, qu.peek());

        qu.enqueue(4);
        assertEquals(2, qu.getSize());
        assertEquals(5, qu.peek());

        qu.enqueue(3);
        assertEquals(3, qu.getSize());
        assertEquals(5, qu.peek());

        qu.dequeue();
        assertEquals(2, qu.getSize());
        assertEquals(4, qu.peek());

        qu.dequeue();
        assertEquals(1, qu.getSize());
        assertEquals(3, qu.peek());

        qu.dequeue();
        assertEquals(0, qu.getSize());
        assertThrows(EmptyQueueException.class, qu::peek);

        qu.dequeue();
        assertEquals(0, qu.getSize());
        assertTrue(qu.isEmpty());
        assertThrows(EmptyQueueException.class, qu::peek);

        qu.enqueue(-1);
        assertEquals(1, qu.getSize());
        assertEquals(-1, qu.peek());

        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        assertEquals(0, qu.getSize());
        assertThrows(EmptyQueueException.class, qu::peek);

    }

    @Test
    public void ArrayImplementationQueue() throws Exception {
        ArrayQueue qu = new ArrayQueue();
        assertEquals(0, qu.getSize());

        qu.enqueue(5);
        assertEquals(1, qu.getSize());
        assertEquals(5, qu.peek());

        qu.enqueue(4);
        assertEquals(2, qu.getSize());
        assertEquals(5, qu.peek());

        qu.dequeue();
        assertEquals(1, qu.getSize());
        assertEquals(4, qu.peek());

        qu.dequeue();
        assertEquals(0, qu.getSize());
        assertThrows(EmptyQueueException.class, qu::peek);

        assertThrows(EmptyQueueException.class, qu::dequeue);

        qu.enqueue(-1);
        assertEquals(1, qu.getSize());
        assertEquals(-1, qu.peek());


        qu.dequeue();
        assertThrows(EmptyQueueException.class, qu::dequeue);
        assertThrows(EmptyQueueException.class, qu::dequeue);
        assertThrows(EmptyQueueException.class, qu::dequeue);
        assertThrows(EmptyQueueException.class, qu::dequeue);
        assertEquals(0, qu.getSize());
        assertThrows(EmptyQueueException.class, qu::peek);
    }

    @Test
    public void shouldThrowFullQueueException() throws Exception {
        ArrayQueue qu = new ArrayQueue();
        assertEquals(0, qu.getSize());
        for (int i = 0; i < 100; i++) {
            qu.enqueue(1);
        }
        assertThrows(FullQueueException.class, () -> qu.enqueue(8));
    }
}
