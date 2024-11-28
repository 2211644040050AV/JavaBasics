public class LinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class members
    private Node head;
    private Node tail;

    // Add first
    public void addFirst(int data) {
        // Step 1 - create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode next = head
        newNode.next = head;

        // Step 3 - head = newNode
        head = newNode;
    }

    // Print the LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printList();
    }
}
