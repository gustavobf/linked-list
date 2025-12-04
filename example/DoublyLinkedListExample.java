package example;

import type.*;

public class DoublyLinkedListExample {

    public static void main (String[] args) {
        printSimpleDoublyLinkedList();
        printSimpleDoublyLinkedListWithInsertionAtFront();
        printSimpleDoublyLinkedListWithInsertionAtEnd();
    }

    private static void printSimpleDoublyLinkedList () {
        System.out.print("Simple Doubly Linked List: ");
        print(getNodeDoublyLinkedList());
        System.out.println();
    }

    private static void printSimpleDoublyLinkedListWithInsertionAtFront () {
        System.out.print("Simple Doubly Linked List with insertion at beginning: ");
        print(insertAtFront(getNodeDoublyLinkedList(), -10));
        System.out.println();
    }

    private static void printSimpleDoublyLinkedListWithInsertionAtEnd () {
        System.out.print("Simple Doubly Linked List with insertion at end: ");
        print(insertAtEnd(getNodeDoublyLinkedList(), 50));
        System.out.println();
    }

    private static NodeDoublyLinkedList insertAtFront (NodeDoublyLinkedList head, int value) {
        NodeDoublyLinkedList newValue = new NodeDoublyLinkedList(value);
        newValue.next = head;

        if (head != null) {
            head.previous = newValue;
        }

        return newValue;
    }

    private static NodeDoublyLinkedList insertAtEnd (NodeDoublyLinkedList head, int value) {
        NodeDoublyLinkedList newValue = new NodeDoublyLinkedList(value);

        if (head == null) {
            return newValue;
        }

        NodeDoublyLinkedList curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newValue;
        newValue.previous = curr;

        return head;


    }

    private static void print (NodeDoublyLinkedList head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" <-> ");
            }
            head = head.next;
        }
    }

    private static NodeDoublyLinkedList getNodeDoublyLinkedList () {
        NodeDoublyLinkedList head = new NodeDoublyLinkedList(10);

        head.next = new NodeDoublyLinkedList(20);
        head.next.previous = head;

        head.next.next = new NodeDoublyLinkedList(30);
        head.next.next.previous = head.next;

        head.next.next.next = new NodeDoublyLinkedList(40);
        head.next.next.next.previous = head.next.next;
        return head;
    }

}
