package ds.stack;

import ds.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {
    @Test
    public void LinkedlistStack() throws EmptyStackException {
        LinkedListStack st = new LinkedListStack();
        assertEquals(0, st.getSize());
        assertThrows(EmptyStackException.class, st::pop);

        st.push(5);
        assertEquals(1, st.getSize());
        assertEquals(5, st.top());

        st.push(-3);
        assertEquals(2, st.getSize());
        assertEquals(-3, st.top());

        st.push(100);
        assertEquals(3, st.getSize());
        assertEquals(100, st.top());

        st.pop();
        assertEquals(2, st.getSize());
        assertEquals(-3, st.top());

        st.push(10);
        assertEquals(3, st.getSize());
        assertEquals(10, st.top());

        st.pop();
        assertEquals(2, st.getSize());
        assertEquals(-3, st.top());

        st.pop();
        assertEquals(1, st.getSize());
        assertEquals(5, st.top());

        st.pop();
        assertEquals(0, st.getSize());
        assertThrows(EmptyStackException.class, st::pop);

    }

    @Test
    public void ArrayStack() throws StackOverflowException, EmptyStackException {
        ArrayStack st = new ArrayStack();
        assertEquals(0, st.getSize());
        assertThrows(EmptyStackException.class, st::top);

        st.push(5);
        assertEquals(1, st.getSize());
        assertEquals(5, st.top());

        st.push(-3);
        assertEquals(2, st.getSize());
        assertEquals(-3, st.top());

        st.push(100);
        assertEquals(3, st.getSize());
        assertEquals(100, st.top());

        st.pop();
        assertEquals(2, st.getSize());
        assertEquals(-3, st.top());

        st.push(10);
        assertEquals(3, st.getSize());
        assertEquals(10, st.top());

        st.pop();
        assertEquals(2, st.getSize());
        assertEquals(-3, st.top());

        st.pop();
        assertEquals(1, st.getSize());
        assertEquals(5, st.top());

        st.pop();
        assertEquals(0, st.getSize());
        assertThrows(EmptyStackException.class, st::top);
        assertThrows(EmptyStackException.class, st::pop);

        st.push(5);
        assertEquals(1, st.getSize());
        assertEquals(5, st.top());

        st.push(4);
        assertEquals(2, st.getSize());
        assertEquals(4, st.top());

        st.push(3);
        assertEquals(3, st.getSize());
        assertEquals(3, st.top());

        st.push(2);
        assertEquals(4, st.getSize());
        assertEquals(2, st.top());

        st.push(1);
        assertEquals(5, st.getSize());
        assertEquals(1, st.top());

        assertThrows(StackOverflowException.class, () -> st.push(10));
        assertThrows(StackOverflowException.class, () -> st.push(10));
        assertThrows(StackOverflowException.class, () -> st.push(10));
    }
}
