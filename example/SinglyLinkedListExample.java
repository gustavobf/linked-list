package example;

import type.*;

public class SinglyLinkedListExample {

    public static void main (String[] args) {
        printSimpleSinglyLinkedList();
    }

    private static void printSimpleSinglyLinkedList () {

        System.out.print("Simple Singly Linked List: ");

        NodeSinglyLinkedList head = new NodeSinglyLinkedList(10);

        head.next = new NodeSinglyLinkedList(20);

        head.next.next = new NodeSinglyLinkedList(30);

        head.next.next.next = new NodeSinglyLinkedList(40);

        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            if (head != null) {
                System.out.print(" -> ");
            }
        }

        System.out.println();

    }

}
