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

    public boolean contains(T item) {
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

}
