package type;

public class NodeDoublyLinkedList {

    public int data;
    public NodeDoublyLinkedList previous;
    public NodeDoublyLinkedList next;

    public NodeDoublyLinkedList (int newData) {
        data = newData;
        next = null;
        previous = null;
    }

}
