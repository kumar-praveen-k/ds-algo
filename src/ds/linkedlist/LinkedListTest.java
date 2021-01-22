package ds.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void addNodesCorrectly() {
        LinkedList l = new LinkedList();
        assertEquals(0, l.getSize());
        assertTrue(l.isEmpty());

        l.add(7, 2);
        assertFalse(l.isEmpty());
        assertEquals(1, l.getSize());
        assertEquals("7", l.toString());

        l.add(3, 1);
        assertFalse(l.isEmpty());
        assertEquals(2, l.getSize());
        assertEquals("3 -> 7", l.toString());

        l.add(4, 3);
        assertFalse(l.isEmpty());
        assertEquals(3, l.getSize());
        assertEquals("3 -> 7 -> 4", l.toString());

        l.add(1, 7);
        assertFalse(l.isEmpty());
        assertEquals(4, l.getSize());
        assertEquals("3 -> 7 -> 4 -> 1", l.toString());

        l.add(5, 0);
        assertFalse(l.isEmpty());
        assertEquals(5, l.getSize());
        assertEquals("5 -> 3 -> 7 -> 4 -> 1", l.toString());
    }

    @Test
    public void deleteNodesCorrectly() {
        int[] myArray = new int[]{1, 3, 54, 41, 87, 4554, 3};

        LinkedList list = LinkedList.fromArray(myArray);
        assertEquals("1 -> 3 -> 54 -> 41 -> 87 -> 4554 -> 3", list.toString());

        list.delete(1);
        assertEquals(6, list.getSize());
        assertEquals("3 -> 54 -> 41 -> 87 -> 4554 -> 3", list.toString());

        list.delete(-3);
        assertEquals(5,list.getSize());
        assertEquals("54 -> 41 -> 87 -> 4554 -> 3", list.toString());

        list.delete(4);
        assertEquals(4,list.getSize());
        assertEquals("54 -> 41 -> 87 -> 3", list.toString());

        list.delete(8);
        assertEquals(3,list.getSize());
        assertEquals("54 -> 41 -> 87", list.toString());

        list.delete(4);
        assertEquals(2,list.getSize());
        assertEquals("54 -> 41", list.toString());

        list.delete(0);
        assertEquals(1,list.getSize());
        assertEquals("41", list.toString());

        list.delete(50);
        assertEquals(0,list.getSize());
        assertEquals("", list.toString());


    }
    @Test
    public void reverseString(){
        int[] myArray = new int[]{1, 3, 54, 41, 87, 4554, 3};

        LinkedList list = LinkedList.fromArray(myArray);
        assertEquals("1 -> 3 -> 54 -> 41 -> 87 -> 4554 -> 3", list.toString());

        list.reverselist();
        assertEquals("3 -> 4554 -> 87 -> 41 -> 54 -> 3 -> 1", list.toString());
    }
    @Test
    public void shouldCreateLinkedListFromArray() {
        int[] myArray = new int[]{1, 3, 54, 2, 4, 6};

        LinkedList list = LinkedList.fromArray(myArray);

        assertFalse(list.isEmpty());
        assertEquals(6, list.getSize());
        assertEquals("1 -> 3 -> 54 -> 2 -> 4 -> 6", list.toString());
    }
}
