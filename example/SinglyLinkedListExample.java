package example;

import type.*;

public class SinglyLinkedListExample {

    public static void main (String[] args) {
        printSimpleSinglyLinkedList();
        printSimpleSinglyLinkedListWithInsertionAtFront();
        printSimpleSinglyLinkedListWithInsertionAtEnd();
    }

    private static void printSimpleSinglyLinkedList () {
        System.out.print("Simple Singly Linked List: ");
        print(getNodeSinglyLinkedList());
        System.out.println();
    }

    private static void printSimpleSinglyLinkedListWithInsertionAtFront () {
        System.out.print("Simple Singly Linked List with insertion at beginning: ");
        print(insertAtFront(getNodeSinglyLinkedList(), -10));
        System.out.println();
    }

    private static void printSimpleSinglyLinkedListWithInsertionAtEnd () {
        System.out.print("Simple Singly Linked List with insertion at end: ");
        print(insertAtEnd(getNodeSinglyLinkedList(), 50));
        System.out.println();
    }

    private static NodeSinglyLinkedList insertAtFront (NodeSinglyLinkedList head, int data) {
        NodeSinglyLinkedList newNode = new NodeSinglyLinkedList(data);
        newNode.next = head;
        return newNode;
    }

    private static NodeSinglyLinkedList insertAtEnd (NodeSinglyLinkedList head, int data) {
        NodeSinglyLinkedList newNode = new NodeSinglyLinkedList(data);

        if (head == null) {
            return newNode;
        }

        NodeSinglyLinkedList curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;

        return head;

    }

    private static void print (NodeSinglyLinkedList head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            if (head != null) {
                System.out.print(" -> ");
            }
        }
    }

    private static NodeSinglyLinkedList getNodeSinglyLinkedList () {
        NodeSinglyLinkedList head = new NodeSinglyLinkedList(10);
        head.next = new NodeSinglyLinkedList(20);
        head.next.next = new NodeSinglyLinkedList(30);
        head.next.next.next = new NodeSinglyLinkedList(40);
        return head;
    }

}
