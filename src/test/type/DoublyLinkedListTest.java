package type;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void testDoublyLinkedListCreation () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertEquals(0, list.size());
        assertNull(list.getFirst());
        assertNull(list.getLast());
    }

    @Test
    public void testDoublyLinkedListAppend () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        assertEquals(5, list.size());
        assertEquals(10, list.getFirst());
        assertEquals(50, list.getLast());
    }

    @Test
    public void testDoublyLinkedListPrepend () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(60);
        list.prepend(-10);
        assertEquals(6, list.size());
        assertEquals(-10, list.getFirst());
        assertEquals(60, list.getLast());
    }

    @Test
    public void testDoublyLinkedListPrependCreation () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.prepend(-5);
        assertEquals(1, list.size());
        assertEquals(-5, list.getFirst());
        assertEquals(-5, list.getLast());
    }

    @Test
    public void testDoublyLinkedListContains () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(15);
        list.append(20);
        assertTrue(list.contains(5));
        assertTrue(list.contains(15));
        assertTrue(list.contains(20));
    }

    @Test
    public void testDoublyLinkedListContainsNull () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertFalse(list.contains(null));
    }

}
