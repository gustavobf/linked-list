package type;

import java.util.*;

class Node<T> {
    T value;
    Node<T> prev;
    Node<T> next;

    Node (T value) {
        this.value = value;
        this.prev = this.next = null;
    }

}

public class DoublyLinkedList<T> {
    private int length;
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList () {
        this.length = 0;
        this.head = this.tail = null;
    }

    public void append (T item) {
        Node node = new Node(item);

        if (this.head == null) {
            this.length++;
            this.head = this.tail = node;
            return;
        }

        this.length++;

        Node<T> curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = this.tail = node;
        node.prev = curr;

    }

    public void prepend (T item) {
        Node node = new Node(item);

        if (this.head == null) {
            this.append(item);
            return;
        }

        this.length++;

        this.head.prev = node;
        node.next = this.head;
        this.head = node;
    }

    public int size () {
        return this.length;
    }

    public T getFirst () {
        if (this.head == null) {
            return null;
        }
        return this.head.value;
    }

    public T getLast () {
        if (this.tail == null) {
            return null;
        }
        return this.tail.value;
    }

    public boolean contains (T item) {
        if (this.head == null) {
            return false;
        }

        Node<T> curr = this.head;

        while (curr != null) {
            if (Objects.equals(curr.value, item)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void insertAt (T item, int idx) {

        if (idx < 0 || idx > this.length) {
            throw new IndexOutOfBoundsException("oh no");
        }

        if (idx == this.length) {
            this.append(item);
            return;
        } else if (idx == 0) {
            this.prepend(item);
            return;
        }

        Node<T> curr = this.head;
        for (int i = 0; i < idx; i++) {
            curr = curr.next;
        }

        Node<T> node = new Node(item);
        Node<T> prev = curr.prev;

        node.next = curr;
        node.prev = prev;
        curr.prev = node;

        prev.next = node;
        this.length++;
    }

    private Node<T> getAt (int idx) {
        Node<T> curr = this.head;
        for (int i = 0; curr != null && i < idx; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public T get (int idx) {
        if (this.getAt(idx) == null) {
            return null;
        }
        return this.getAt(idx).value;
    }

    public T remove (T item) {
        Node<T> curr = this.head;

        while (curr != null) {

            if (Objects.equals(curr.value, item)) {

                if (curr.prev == null) {
                    this.head = curr.next;
                } else {
                    curr.prev.next = curr.next;
                }

                this.length--;
                return curr.value;
            }

            curr = curr.next;
        }
        return null;
    }

    public T removeAt (int idx) {

        if (this.getAt(idx) == null) {
            return null;
        }

        Node<T> curr = this.head;

        for (int i = 0; i < idx; i++) {
            curr = curr.next;
        }

        if (curr.prev == null) {
            this.head = curr.next;
        } else {
            curr.prev.next = curr.next;
        }

        this.length--;
        return curr.value;
    }
}
