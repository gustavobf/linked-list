package type;

class SinglyLinkedListNode<T> {
    T value;
    SinglyLinkedListNode<T> next;

    SinglyLinkedListNode(T value) {
        this.value = value;
        next = null;
    }

}

public class SinglyLinkedList<T> {

    private int length;
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;

    public SinglyLinkedList () {
        length = 0;
        head = tail = null;
    }

    public void append (T item) {
        SinglyLinkedListNode<T> newData = new SinglyLinkedListNode(item);

        if (this.head == null) {
            this.length++;
            this.head = this.tail = newData;
            return;
        }

        this.length++;

        SinglyLinkedListNode<T> curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newData;
        this.tail = newData;
    }

    public void prepend(T item) {

        SinglyLinkedListNode<T> newData = new SinglyLinkedListNode(item);

        if (this.head == null ) {
            this.length++;
            this.head = this.tail = newData;
            return;
        }

        this.length++;

        newData.next = this.head;
        this.head = newData;
    }

    public int size() {
        return this.length;
    }

    public T getFirst() {
        if (this.head == null) {
            return null;
        }
        return this.head.value;
    }

    public T getLast() {
        if (this.tail == null) {
            return null;
        }
        return this.tail.value;
    }

}
