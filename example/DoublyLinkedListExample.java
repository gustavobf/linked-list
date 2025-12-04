package example;

import type.*;

public class DoublyLinkedListExample {

    public static void main (String[] args) {
        printSimpleSinglyLinkedList();
    }

    private static void printSimpleSinglyLinkedList () {

        System.out.print("Simple Doubly Linked List: ");

        NodeDoublyLinkedList head = new NodeDoublyLinkedList(10);

        head.next = new NodeDoublyLinkedList(20);
        head.next.previous = head;

        head.next.next = new NodeDoublyLinkedList(30);
        head.next.next.previous = head.next;

        head.next.next.next = new NodeDoublyLinkedList(40);
        head.next.next.next.previous = head.next.next;

        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" <-> ");
            }
            head = head.next;
        }

        System.out.println();

    }

}
