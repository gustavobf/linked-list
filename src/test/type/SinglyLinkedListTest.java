package type;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void testSinglyLinkedListCreation () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(0, list.size());
        assertNull(list.getFirst());
        assertNull(list.getLast());
    }

    @Test
    public void testSinglyLinkedListCreationBeforeUsingPrepend () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.prepend(10);
        assertEquals(1, list.size());
        assertEquals(10, list.getFirst());
        assertEquals(10, list.getLast());
    }

    @Test
    public void testSinglyLinkedListAddingNewData () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(10);
        list.append(20);
        list.append(30);
        assertEquals(3, list.size());
        assertEquals(10, list.getFirst());
    }

    @Test
    public void testSinglyLinkedListAddingNewDataWithPrepend () {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(10);
        list.prepend(5);
        list.prepend(1);
        assertEquals(3, list.size());
        assertEquals(1, list.getFirst());
        assertEquals(10, list.getLast());
    }

}
