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

    @Test
    public void testInsertAt () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);

        list.insertAt(12, 2);

        assertEquals(5, list.size());
        assertEquals(12, list.get(2));
        assertTrue(list.contains(12));
    }

    @Test
    public void testRemoveAt () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);

        assertEquals(15, list.removeAt(2));
        assertEquals(3, list.size());
        assertFalse(list.contains(15));
    }

    @Test
    public void testRemoveAtFront () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);

        assertEquals(5, list.removeAt(0));
        assertEquals(3, list.size());
        assertFalse(list.contains(5));
    }

    @Test
    public void testRemoveAtEnd () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);

        assertEquals(20, list.removeAt(3));
        assertEquals(3, list.size());
        assertFalse(list.contains(20));
    }

    @Test
    public void testRemove () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);

        assertEquals(10, list.remove(10));
        assertEquals(3, list.size());
        assertFalse(list.contains(10));
    }

    @Test
    public void testRemoveFront () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(7);
        list.append(10);
        list.append(15);
        list.append(20);

        assertEquals(7, list.remove(7));
        assertEquals(3, list.size());
        assertFalse(list.contains(7));
    }

    @Test
    public void testRemoveEnd () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(21);

        assertEquals(21, list.remove(21));
        assertEquals(3, list.size());
        assertFalse(list.contains(21));
    }

    @Test
    public void testErrorInsertAt () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(21);

        assertThrows(IndexOutOfBoundsException.class, () -> list.insertAt(1, -1));
    }

    @Test
    public void testErrorInsertAtOutOfBounds () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(21);

        assertThrows(IndexOutOfBoundsException.class, () -> list.insertAt(1, 5));
    }

    @Test
    public void testInsertAtIdxEqualsLength () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(21);

        list.insertAt(1, 4);

        assertEquals(5, list.size());
        assertEquals(1, list.get(4));
    }

    @Test
    public void testInsertAtFront () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(21);

        list.insertAt(1, 0);

        assertEquals(5, list.size());
        assertEquals(1, list.getFirst());
    }

    @Test
    public void testRemovingAt () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertNull(list.removeAt(5));
    }

    @Test
    public void testGetNull () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertNull(list.get(5));
    }

    @Test
    public void testRemoveNull () {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertNull(list.remove(5));
    }

}
